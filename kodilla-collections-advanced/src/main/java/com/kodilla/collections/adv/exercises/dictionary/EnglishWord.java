package com.kodilla.collections.adv.exercises.dictionary;

public class EnglishWord {
    private final PartOfSpeech partOfSpeech;
    private final String word;

    public EnglishWord(PartOfSpeech partOfSpeech, String word) {
        this.partOfSpeech = partOfSpeech;
        this.word = word;
    }

    public PartOfSpeech getPartOfSpeech() {
        return partOfSpeech;
    }

    public String getWord() {
        return word;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EnglishWord that = (EnglishWord) o;
        return partOfSpeech == that.partOfSpeech && word.equals(that.word);
    }

    @Override
    public int hashCode() {
        return Objects.hash(partOfSpeech, word);
    }
}
