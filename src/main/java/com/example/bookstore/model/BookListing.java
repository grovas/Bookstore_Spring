package com.example.bookstore.model;

import java.util.List;

public class BookListing {
    private List<Book> books;
    private int count;

    public BookListing(List<Book> books, int count) {
        this.books = books;
        this.count = count;
    }

    public List<Book> getBooks() {
        return books;
    }

    public int getCount() {
        return count;
    }
}
