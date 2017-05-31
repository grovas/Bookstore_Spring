package com.example.bookstore.service;

import com.example.bookstore.model.Book;
import com.example.bookstore.model.BookListing;
import com.example.bookstore.repository.BookRepository;
import org.assertj.core.util.Lists;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookServiceSpringTest {
    // testowanie przez stringa jest calosci systemu/integracja
    @Autowired
    BookRepository bookRepository;
    @Autowired
    BookService bookService;

    @Before
    public void setUp() {
        bookRepository.deleteAll();
        bookRepository.save(new Book("kniga 1", "pisarz 1"));
        bookRepository.save(new Book("kniga 2", "pisarz 2"));
    }

    @Test
    public void getListingData() throws Exception {
        // given

        // when
        BookListing bookListing = bookService.getListingData();

        // then
        assertEquals(
                new BookListing(
                        Lists.newArrayList(
                                new Book("kniga 1", "pisarz 1"),
                                new Book("kniga 2", "pisarz 2")
                        ),
                        2),
                bookListing
        );
    }
}