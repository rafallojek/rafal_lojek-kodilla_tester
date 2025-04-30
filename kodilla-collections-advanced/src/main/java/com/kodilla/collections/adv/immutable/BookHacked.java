package com.kodilla.collections.adv.immutable;

import java.lang.reflect.Field;

public class BookHacked {
    private String author;
    private String title;
    private int year;

    public BookHacked(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    public void hackTitle(String newTitle) throws Exception {
        Field field = this.getClass().getDeclaredField("title");
        field.setAccessible(true);
        field.set(this, newTitle);
    }

    @Override
    public String toString() {
        return "BookHacked(author=" + author + ", title=" + title + ", year=" + year + ")";
    }
}
