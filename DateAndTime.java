import java.time.*;

public class DateAndTime {
    public static void main(String[] args) {
        Instant it = Instant.now();
        System.out.println("Instant Time: " + it);
        

        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println("Zoned D&T: " + zdt);

        Duration dur = Duration.between(it, zdt);
        System.out.println("Differrence between two: "+dur);

        Duration dur2 = Duration.ofMillis(90);
        System.out.println("Mili: "+ dur2);

        Duration dur3 = Duration.ofMinutes(90);
        System.out.println("Min: "+ dur3);

        Duration dur4 = Duration.ofHours(90);
        System.out.println("Hrs: "+ dur4);
        
        //use Period for days, month and years
        Period p1 = Period.ofDays(365);
        System.out.println("Days: "+ p1);

        Period p2 = Period.ofWeeks(52);
        System.out.println("Weeks: "+ p2);

        Period p3 = Period.ofMonths(24);
        System.out.println("Month: "+ p3);

        Period p4 = Period.ofYears(1);
        System.out.println("Years: "+ p4);




    }
}
