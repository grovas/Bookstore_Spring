package com.example.bookstore.repository;

import com.example.bookstore.model.Book;
import com.google.common.collect.Lists;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookRepository {
    private List<Book> books = Lists.newArrayList();

    public List<Book> findAll(){
        return books;
    }

    public void save(Book book){
        books.add(book);
    }

    public void deleteAll() {
        books.removeAll(books);
    }

    public void deleteOne (int id) {
        books.remove(id);
    }
}
