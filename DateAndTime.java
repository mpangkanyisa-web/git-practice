import java.time.*;
import java.time.temporal.ChronoField;

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


        System.out.println(p4.getYears());
        System.out.println(p5.get(ChronoField.DAY_OF_MONTH));




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

// Phase 1: Setting the Start AnchorjavaLocalDate startDate = LocalDate.of(2026, 8, 20);
// Use code with caution.What happens: This creates a standard LocalDate object set to August 20, 2026.Why it is needed: To fix overflowing days, Java needs a real starting point on the human calendar. Without a starting date, Java does not know whether a month has 28, 29, 30, or 31 days.Phase 2: Defining the Raw Data and Finding the End DatejavaPeriod rawPeriod = Period.of(2, 24, 368);
// Use code with caution.What happens: This creates an uncleaned Period bundle. Java saves the internal numbers exactly as you wrote them: Years = 2, Months = 24, Days = 368.The Output format: If you printed this object directly, it would show as P2Y24M368D.javaLocalDate endDate = startDate.plus(rawPeriod);
// Use code with caution.What happens: Java takes the startDate (2026-08-20) and adds the rawPeriod to it using three steps from left to right:Step A (Years): Adds 2 years to 2026-08-20 \(\rightarrow \) 2028-08-20.Step B (Months): Adds 24 months (exactly 2 years) to 2028-08-20 \(\rightarrow \) 2030-08-20.Step C (Days): Adds 368 days to 2030-08-20. Because Java is moving through a real calendar timeline, it counts through the exact days of each month (August has 31 days, September has 30 days, etc.). It also skips through 2031.The Result: The endDate variable now holds the precise calendar date of 2031-08-23.Phase 3: Extracting the Clean PeriodjavaPeriod cleanPeriod = Period.between(startDate, endDate);
// Use code with caution.What happens: The Period.between() method calculates the total calendar time distance from your start date (2026-08-20) to your calculated end date (2031-08-23).The Clean Math Execution:It counts the full years from 2026-08-20 to 2031-08-20 \(\rightarrow \) 5 Years.It counts remaining full months from 2031-08-20 to 2031-08-20 \(\rightarrow \) 0 Months.It counts the final leftover days from 2031-08-20 to 2031-08-23 \(\rightarrow \) 3 Days.Phase 4: Output DisplayjavaSystem.out.println("Cleaned Output: " + cleanPeriod);
// Use code with caution.Console Output: Cleaned Output: P5Y0M3DMeaning: By using a real timeline as an anchor, your raw numbers (2 Years, 24 Months, 368 Days) have successfully rolled over into a clean human statement: 5 years, 0 months, and 3 days.Would you like to see how to use DateTimeFormatter to print this final cleanPeriod out as a clean, text-based sentence instead of the P5Y0M3D computer code?


 }
}
