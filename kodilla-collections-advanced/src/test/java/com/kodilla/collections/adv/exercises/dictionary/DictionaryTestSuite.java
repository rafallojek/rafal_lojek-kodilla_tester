package com.kodilla.collections.adv.exercises.dictionary;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DictionaryTestSuite {

    @Test
    public void testAddWord() {
        // Given
        Dictionary dictionary = new Dictionary();
        String polishWord = "stos";
        EnglishWord englishWord = new EnglishWord(PartOfSpeech.NOUN,  "stack");
        // When
        dictionary.addWord(polishWord, englishWord);
        // Then
        assertEquals(1, dictionary.size());
    }

    @Test
    public void testFindEnglishWords(){
        // Given
        Dictionary dictionary = new Dictionary();
        dictionary.addWord("stos", new EnglishWord(PartOfSpeech.NOUN, "stack"));
        dictionary.addWord("gra", new EnglishWord(PartOfSpeech.NOUN, "play"));
        dictionary.addWord("gra", new EnglishWord(PartOfSpeech.NOUN, "game"));
        dictionary.addWord("grac", new EnglishWord(PartOfSpeech.NOUN, "play"));
        // When
        List<EnglishWord> result = dictionary.findEnglishWords("gra");
        // Then
        assertEquals(2, result.size());
    }
}