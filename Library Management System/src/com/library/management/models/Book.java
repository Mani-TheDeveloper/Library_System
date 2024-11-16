package com.library.management.models;

public class Book {
    private String title, author, category;
    private int bookId;

    public Book(int bookId, String... bookString) {
        this.bookId = bookId;
        this.title = bookString[0];
        this.author = bookString[1];
        this.category = bookString[2];
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookTitle() {
        return title;
    }

    public String getBookAuthor() {
        return author;
    }

    public String getBookCategory() {
        return category;
    }
}
