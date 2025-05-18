package com.kodilla.homework_one;

public class Predicate extends SentencePart {
    @Override
    protected String[] getWords() {
        return new String[]{
                "sings", "vanishes", "waits", "wanders", "shouts",
                "flows", "dances", "glows", "falls", "whispers",
                "sleeps", "rises", "cries", "dreams", "listens",
                "flies", "burns", "hovers", "laughs", "echoes"
        };
    }
}
