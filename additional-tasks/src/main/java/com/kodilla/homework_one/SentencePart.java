package com.kodilla.homework_one;

import java.util.Random;

public abstract class SentencePart {
    protected static final Random random = new Random();

    protected abstract String[] getWords();

    public String generate() {
        String[] words = getWords();
        return words[random.nextInt(words.length)];
    }
}
