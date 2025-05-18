package com.kodilla.homework_one;

public class Subject extends SentencePart {
    @Override
    protected String[] getWords() {
        return new String[]{
                "The cat", "A dream", "That man", "The wind", "My thoughts",
                "An echo", "Your voice", "The sky", "A whisper", "This world",
                "The river", "A stranger", "The child", "The night", "A memory",
                "The flame", "A shadow", "The bird", "The silence", "My soul"
        };
    }
}
