package com.example.bookstore.endpoint;

import com.example.bookstore.model.Book;
import com.example.bookstore.model.BookDto;
import com.example.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Date;
import java.util.Map;

@Controller
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    //@RequestMapping(method= RequestMethod.GET, value = "/hello")
    @GetMapping(value="/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping()
    public String listing(Map<String, Object> model){
        model.put("time", new Date());
        model.put("listing", bookService.getListingData());
        return "book-listing";
    }

    @PostMapping()
    public String addBook(@ModelAttribute BookDto bookDto,
                          RedirectAttributes redirectAttributes) {
        //bookService.addBook(book);
        bookService.addBook(bookDto.fromDto());
        redirectAttributes.addFlashAttribute(
                "result", "Ksiazka zostala dodana");
        return "redirect:/books";
    }

    @GetMapping("/{text}")
    public String deleteBook(@PathVariable("text") String text,
                            Map<String, Object> model,
                            @ModelAttribute BookDto bookDto,
                             RedirectAttributes redirectAttributes) {
        model.put("text", text);
        bookService.deleteBook(bookDto.getId());
        redirectAttributes.addFlashAttribute(
                "result", "Ksiazka zostala usunieta");
        return "redirect:/books";
    }
}
