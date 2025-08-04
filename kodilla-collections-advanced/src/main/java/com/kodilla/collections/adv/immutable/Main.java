package com.kodilla.collections.adv.immutable;

import com.kodilla.records.BookRecord;

public class Main {
    public static void main(String[] args) throws Exception {
        BookRecord bookRecord = new BookRecord("test", "Test Position");

        Book book = new Book(bookRecord.author(), bookRecord.title());
        BookHacked hacked = new BookHacked(bookRecord.author(), bookRecord.title());
        ImmutableExample example = new ImmutableExample(bookRecord.author(), bookRecord.title(), bookRecord.year());

        hacked.hackTitle("Title Change!");

        System.out.println(bookRecord);
        System.out.println(book);
        System.out.println(hacked);
        System.out.println(example);
    }
}
