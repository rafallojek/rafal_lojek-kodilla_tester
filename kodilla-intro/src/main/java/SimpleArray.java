public class SimpleArray {
    public static void main(String[] args) {
        String[] books = new String[5];
        books[0] = "Kompania braci";
        books[1] = "Finansowa Forteca";
        books[2] = "Certyfikowany tester ISTQB(CTFL)";
        books[3] = "Historia bez cenzury";
        books[4] = "Atlas gor Polskich";

        int numberOfElements = books.length;
        System.out.println("Moja tablica zawiera 5 elementow");
        //Ćwiczenie 1 - tworzenie tablicy.

        String book = books[2];
        System.out.println(book);
        //Ćwiczenie 2 - wyciąganie elementu z tablicy.
    }
}
