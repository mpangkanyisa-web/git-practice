public class LambdaArrow {
    public static void main(String[] args){
        String name = "Kanyisa";
        int length = name.length();
        // String message;...you can declare message here if you want.


        //instead of using if/else statement, you use lambda arrow expression

        String message = switch (length) {
            case 0 -> "The name is completely empty";
            case 7 -> "Full";

            default -> "Standard Length";
        };
        
        System.out.println(message);
    }
}
// ALSO check the bark eexample, where they didn't have to create a new varibale like message, where they just used the originall 2 instance varibles only 
// String dogSize = "Large";

// // The entire switch is assigned to the variable directly!
// String barkVolume = switch (dogSize) {
//     case "Small"  -> "Quiet yip";
//     case "Medium" -> "Normal woof";
//     case "Large"  -> "Loud boom";
//     default       -> "Unknown bark"; // Exhaustiveness: 'default' is mandatory here!
// }; 

// System.out.println(barkVolume);


    

