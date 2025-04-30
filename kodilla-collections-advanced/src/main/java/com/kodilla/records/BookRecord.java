package com.kodilla.records;

public record BookRecord(String author, String title, int year) {
    BookRecord modifiedBook = new BookRecord(
            bookRecord.author(),
            "New title",
            bookRecord.year())
;}

