package com.kodilla.collections.adv.immutable;

public class Book {
    private String author;
    private String title;
    private int year;

    public Book(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    // gettery, settery itd.
}

Book book = new Book(bookRecord.author(), bookRecord.title(), bookRecord.year());