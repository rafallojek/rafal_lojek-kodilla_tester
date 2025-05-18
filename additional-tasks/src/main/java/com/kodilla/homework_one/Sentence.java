package com.kodilla.homework_one;

public class Sentence {
    private final Subject subject = new Subject();
    private final Predicate predicate = new Predicate();
    private final Adverbial adverbial;

    public Sentence() {
        int type = SentencePart.random.nextInt(3);
        switch (type) {
            case 0 -> adverbial = new AdverbialOfTime();
            case 1 -> adverbial = new AdverbialOfPlace();
            default -> adverbial = new AdverbialOfManner();
        }
    }

    public String generate() {
        return subject.generate() + " " + predicate.generate() + " " + adverbial.generate() + ".";
    }
}
