package com.kodilla.collections.adv.immutable;

import com.kodilla.records.BookRecord;

public class Main {
    public static void main(String[] args) throws Exception {
        BookRecord bookRecord = new BookRecord("test", "Test Position", 2022);

        Book book = new Book(bookRecord.author(), bookRecord.title(), bookRecord.year());
        BookHacked hacked = new BookHacked(bookRecord.author(), bookRecord.title(), bookRecord.year());
        ImmutableExample example = new ImmutableExample(bookRecord.author(), bookRecord.title(), bookRecord.year());

        hacked.hackTitle("Title Change!");

        System.out.println(bookRecord);
        System.out.println(book);
        System.out.println(hacked);
        System.out.println(example);
    }
}
