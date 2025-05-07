package com.kodilla;

public class Sentence {

    class Subject extends SentencePart {
        @Override
        public String generate() {
            return words[randomGenerator.nextInt(10)]; // Losowanie z pierwszych 10 słów jako podmiot
        }
    }

    class Predicate extends SentencePart {
        @Override
        public String generate() {
            return words[randomGenerator.nextInt(10, 20)]; // Losowanie z drugich 10 słów jako orzeczenie
        }
    }

    abstract class Adverbial extends SentencePart {
        // Klasa bazowa dla Okoliczników
    }

    class TimeAdverbial extends Adverbial {
        @Override
        public String generate() {
            return "wczoraj"; // Możemy dodać inne konkretne słowa
        }
    }

    class PlaceAdverbial extends Adverbial {
        @Override
        public String generate() {
            return "w parku"; // Możemy dodać inne konkretne słowa
        }
    }

    class MannerAdverbial extends Adverbial {
        @Override
        public String generate() {
            return "szybko"; // Możemy dodać inne konkretne słowa
        }
    }

}
