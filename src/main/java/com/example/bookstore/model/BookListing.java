package com.example.bookstore.model;

import java.util.List;
import java.util.Objects;

public class BookListing {
    private List<Book> books;
    private int count;

    public BookListing(List<Book> books, int count) {
        this.books = books;
        this.count = count;
    }

    public int bookListingSize() {
        return books.size();
    }

    public List<Book> getBooks() {
        return books;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "BookListing{" +
                "books=" + books +
                ", count=" + count +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookListing that = (BookListing) o;
        return count == that.count &&
                Objects.equals(books, that.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(books, count);
    }
}
