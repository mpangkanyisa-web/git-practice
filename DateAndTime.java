import java.time.*;

public class DateAndTime {
    public static void main(String[] args) {
        Instant it = Instant.now();
        System.out.println("Instant Time: " + it);
        

        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println("Zoned D&T: " + zdt);

        Duration dur = Duration.between(it, zdt);
        System.out.println("Difference between two: "+dur);

        Duration dur2 = Duration.ofMillis(90);
        System.out.println("Milli: "+ dur2);

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

        Period p5 = Period.of(2, 24, 368);
        Period normalizedp5 = p5.normalized();
        System.out.println(normalizedp5);


        //normilised doesnt solvec the case

        // Here is the solution, since the normalized() doesn't inlcude the days...it's only the moths that gets automatically converted/added to the year....it excludes the days because we are not sure what period this is and how many days should be in  month:
//         import java.time.LocalDate;
//         import java.time.Period;

//         public class RealNormalization {
//             public static void main(String[] args) {
//                 // 1. Pick a starting anchor date on the calendar
//                 LocalDate startDate = LocalDate.of(2026, 8, 20);

//                 // 2. Add your uncleaned period (2 years, 24 months, 368 days) to that date
//                 Period rawPeriod = Period.of(2, 24, 368);
//                 LocalDate endDate = startDate.plus(rawPeriod);

//                 // 3. Calculate the actual calendar period between the two dates
//                 // This forces Java to look at the real calendar months!
//                 Period cleanPeriod = Period.between(startDate, endDate);

//                 System.out.println("Cleaned Output: " + cleanPeriod); 
//                 // Outputs: P5Y0M3D (5 years, 0 months, and 3 days!)
//             }
//         }




 }
}
