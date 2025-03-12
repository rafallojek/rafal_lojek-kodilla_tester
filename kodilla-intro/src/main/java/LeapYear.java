public class LeapYear {
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        // Przykładowe testy
        int year1 = 2024;
        int year2 = 1900;
        int year3 = 2000;

        System.out.println(year1 + " is leap year? " + isLeapYear(year1)); // true
        System.out.println(year2 + " is leap year? " + isLeapYear(year2)); // false
        System.out.println(year3 + " is leap year? " + isLeapYear(year3)); // true
    }
}