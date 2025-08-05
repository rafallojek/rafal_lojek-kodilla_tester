package com.kodilla.collections.adv.immutable.homework;

import com.kodilla.collections.adv.immutable.ImmutableExample;
import com.kodilla.records.BookRecord;

public class Main {
    public static void main(String[] args) {
        Task task = new Task("Code must be ready within 1 day", 10, TaskPriority.MEDIUM);

        BookRecord bookRecord = new BookRecord("test", "Test Position");
        ImmutableExample example = new ImmutableExample(bookRecord.author(), bookRecord.title(), bookRecord.year());

        System.out.println(task);
        System.out.println(example);
    }
}
