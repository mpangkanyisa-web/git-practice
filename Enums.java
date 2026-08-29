public class Enums {
    // Define an enum for Days
public enum Days {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumExample {
    public static void main(String[] args) {
        Days today = Days.TUESDAY;

        switch (today) {
            case MONDAY -> System.out.println("Start of the work week.");
            case TUESDAY -> System.out.println("Second day of the work week.");
            case WEDNESDAY -> System.out.println("Midweek day.");
            case THURSDAY -> System.out.println("Almost the weekend.");
            case FRIDAY -> System.out.println("Last workday!");
            case SATURDAY, SUNDAY -> System.out.println("Weekend time!");
        }
    }
}
}
