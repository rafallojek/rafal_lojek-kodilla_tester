package com.kodilla;

public class Book {
    private String author;
    private String title;

    // Prywatny konstruktor, aby wymusić użycie metody of
    private Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    // Statyczna metoda fabryczna do tworzenia obiektów Book
    public static Book of(String author, String title) {
        return new Book(author, title);
    }

    // Gettery
    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    // Metoda toString() do czytelnego wyświetlania obiektu
    @Override
    public String toString() {
        return "Book{author='" + author + "', title='" + title + "'}";
    }
}
