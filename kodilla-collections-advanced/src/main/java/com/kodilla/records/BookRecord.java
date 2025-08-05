package com.kodilla.records;

public record BookRecord(String author, String title) {
    public int year() {
        return 0;
    }
}
