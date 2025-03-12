public class LeapYear {
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {

        int year1 = 2024;
        int year2 = 1900;
        int year3 = 2000;

        System.out.println(year1 + " is leap year? " + isLeapYear(year1)); // true
        System.out.println(year2 + " is leap year? " + isLeapYear(year2)); // false
        System.out.println(year3 + " is leap year? " + isLeapYear(year3)); // true
    }
}
//W linijce 3, za cyfrą 100 jest !=. Dlaczego? Dlaczego ! a nie == jak w pozostałych 2 przypadkach? Skąd ! tam?
//W dalszym ciągu linijka 3, dlaczego po słowie year jest % a nie cyfra np.1?
//Linijka 12-14. Dlaczego został wygenerowany taki zapis? tj.to co po println( aż do );


//Przykład podany przez chatGPT po wpisaniu prompta z ćwiczenia. Nie należy go brać pod uwagę, nie jest mój.
//Nie miałem w głowie pomysłu jak to ćwiczenie napisać, także użyłem chatGPT aby sobie pomóc a później zastanowić się
//z czego to się wzięło. Dlaczego tak to wyszło, a nie inaczej. No i myślę że doszedłem do tego tak w 80%.