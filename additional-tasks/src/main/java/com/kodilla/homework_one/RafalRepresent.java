package com.kodilla.homework_one;

import java.util.ArrayList;
import java.util.List;

public class RafalRepresent {
    private final List<Sentence> sentences = new ArrayList<>();

    public RafalRepresent(int numberOfSentences) {
        for (int i = 0; i < numberOfSentences; i++) {
            sentences.add(new Sentence());
        }
    }

    public void printPoem() {
        for (Sentence sentence : sentences) {
            System.out.println(sentence.generate());
        }
    }
}
