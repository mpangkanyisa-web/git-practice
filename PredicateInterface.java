
import java.util.function.Predicate;  //just import, you don't have to say "implements Predicate<>", since you are using -> 

public class PredicateInterface {
    public static void main (String[] args){
        // Define the rule: Checks if a string has more than 3 characters
        Predicate<String> isLongWord = s -> s.length() > 3;

        // Run the rule using the .test() method:
        boolean result1 = isLongWord.test("Kanyisa"); // Returns true
        boolean result2 = isLongWord.test("An");      // Returns false

    }
    
}
