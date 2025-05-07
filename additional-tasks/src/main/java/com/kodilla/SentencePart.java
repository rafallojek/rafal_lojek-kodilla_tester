import java.util.Random;

abstract class SentencePart { // Klasa abstrakcyjna bez dziedziczenia
    // Tablica przypadkowych słów
    protected static final String[] words = {
            "cat", "dog", "house", "car", "tree", "cloud", "sun", "book", "stone", "table",
            "eat", "run", "fly", "play", "sleep", "read", "scream", "ride", "jump", "walk"
    };

    // Tutaj generowane są przypadkowe słowa
    protected static Random randomGenerator = new Random();

    // Metoda z klasy abstrakcyjnej do generowania przypadkowych słów
    public abstract String generate();
}
