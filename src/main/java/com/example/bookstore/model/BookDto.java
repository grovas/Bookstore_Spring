package com.example.bookstore.model;

public class BookDto {
    private int id;
    private String title;
    private String author;

    public BookDto(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book fromDto(){
        return new Book(id, title, author);
    }
}
