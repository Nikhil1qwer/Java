package Introduction.Generics;

enum Days {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

enum Months {
    JANUARY("Jan", 1),
    FEBRUARY("Feb", 2),
    MARCH("Mar", 3),
    APRIL("Apr", 4),
    MAY("May", 5),
    JUNE("Jun", 6),
    JULY("Jul", 7),
    AUGUST("Aug", 8),
    SEPTEMBER("Sep", 9),
    OCTOBER("Oct", 10),
    NOVEMBER("Nov", 11),
    DECEMBER("Dec", 12);

    private final String shortName;
    private final int monthNumber;

    Months(String shortName, int monthNumber) {
        this.shortName = shortName;
        this.monthNumber = monthNumber;
    }

    public String getShortName() {
        return shortName;
    }

    public int getMonthNumber() {
        return monthNumber;
    }
}

/**
 * The Enumerations class demonstrates the use of Java enums.
 * 
 * Enums are used to define a set of named constants. They are particularly
 * useful when you have a fixed set of related constants, such as days of the
 * week, months of the year, directions, etc. Enums provide type safety, making
 * the code more readable and less error-prone compared to using simple
 * constants or strings.
 * 
 * In this example, the Days enum represents the days of the week, and the main
 * method prints out one of the enum values.
 */

public class Enumerations {
    public static void main(String[] args) {
        Days day = Days.MONDAY;
        Months mnt = Months.JANUARY;
        System.out.println(mnt);
        System.out.println(mnt.getShortName() + " " + mnt.getMonthNumber());
        System.out.println(day);
    }
}
