package com.example.bookstore;

import com.example.bookstore.model.Book;
import com.example.bookstore.repository.BookRepository;
import com.example.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookstoreApplication implements CommandLineRunner{

    private final BookService bookService;

    /*@Value("${mymessage}")
    private String mymessage;*/

    @Autowired
    public BookstoreApplication(BookService bookService){
        this.bookService = bookService;
    }

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
        //System.out.println(mymessage);
        //bookRepository = new BookRepository();
	    bookService.addBook(new Book("Mongo", "nie jan"));
        bookService.addBook(new Book("Java", "Ogan"));
		//System.out.println(bookService.getListingData());
	}
}
