package com.kodilla.collections.adv.immutable;

public final class ImmutableExample {
    private final String author;
    private final String title;
    private final int year;

    public ImmutableExample(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    public String getAuthor() { return author; }
    public String getTitle() { return title; }
    public int getYear() { return year; }

    @Override
    public String toString() {
        return "ImmutableExample(author=" + author + ", title=" + title + ", year=" + year + ")";
    }
}
