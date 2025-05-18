package com.kodilla.homework_one;

public class Subject extends SentencePart {
    @Override
    protected String[] getWords() {
        return new String[]{
                "The cat", "A dream", "That man", "The wind", "My thoughts",
                "An echo", "Your voice", "The sky", "A whisper", "This world"
        };
    }
}
