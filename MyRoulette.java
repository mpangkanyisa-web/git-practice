import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.random.RandomGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MyRoulette {
    // am going to need Users
    //We gonna use a RandomGenerator instead of Math.randm()
    // import java.util.random.RandomGenerator; // 1. Import the modern generator tool
    int casinoNum;
    
    private double machineCashBalance; //non-static to keep it private


    ObjectMapper mapper = new ObjectMapper();

    // ✅ THE MODERN TEXT SAVE (Writing)
Files.writeString(Path.of("log.txt"), "Kanyisa won R100.");

// ✅ THE MODERN TEXT READ (Reading)
String data = Files.readString(Path.of("log.txt"));
System.out.println(data);


ObjectMapper mapper = new ObjectMapper();

// ✅ THE MODERN SAVE (Serialization)
// Translates the object into a JSON string and writes it to disk using NIO Files!
String json = mapper.writeValueAsString(playerObject);
Files.writeString(Path.of("save.json"), json);

// ✅ THE MODERN LOAD (Deserialization)
// Pulls the JSON string from disk using NIO Files and translates it back into a class object!
String incomingJson = Files.readString(Path.of("save.json"));
User player = mapper.readValue(incomingJson, User.class); // No manual casting line needed!



HashMap<String, User> casinoRegistry = new HashMap<>();
casinoRegistry.put("Kanyisa123", playerObject);

// Finds them instantly without a loop!
User player = casinoRegistry.get("Kanyisa123"); 

Thread.startVirtualThread(() -> { ... });

 


    
    public MyRoulette(double machineCashBalance){
        if(machineCashBalance >= 0){
        this.machineCashBalance = machineCashBalance;
        }  else{
            System.out.println("Error: Value cannot be a negative value");
        } 
    }
    
    public double getMachineCashBalance(){
        return this.machineCashBalance; 
    }

public static void main(String[] args){

    System.out.println("==Welcome to Roulette!==");
    MyRoulette r = new MyRoulette(1000);
    List <Integer> spinRounds =  List.of(1, 2, 3, 4, 5);
    spinRounds.forEach(currentSpinRound -> {
        System.out.println("===ROUND " + currentSpinRound + "===");
        r.startGame();}
    );
    
    }


void startGame(){

    User uA = new User(500);
    User uB = new User(700);

    generateRandomNum(); //Generate the Casino Random Num
    int userANumber = uA.userAGeneratedNum();
    compareNumbers();     
    }

    void generateRandomNum(){
        RandomGenerator numGen = RandomGenerator.getDefault();//randomising engine
        int targetedRouletteNumber = numGen.nextInt(0,37);
        this.casinoNum = targetedRouletteNumber;
    }
    void compareNumbers(){

        System.out.println("Wnning Number is " + casinoNum);


        if(chosenNumA == casinoNum) {
             System.out.println("A has chosen Number: " + chosenNumA);
            System.out.println("Congrats " + username + "you have won R100");
            }
            else {
                System.out.println("A has chosen Number: " + chosenNumA);
                System.out.println("Wrong Guess A");
            }
          
    
}

class User{    
    int userChosenNum;
    private double userBal;

    //getters and setters

    public double getUserABal(){
        return this.userBal;
    }
    public void setUserABal(double userABal){
        if(userBal >=0){
            this.userBal = userBal;
        }else{
            System.out.println("Error: Value cannot be a negative value");
        } 
    } 

   //Constructor     

    public User(double userBal){
        if(userBal >= 0){
            this.userBal = userBal;
        } else{
            System.out.println("Error: Value cannot be a negative value");
        }
    }

    int userAGeneratedNum(){
        RandomGenerator userGen = RandomGenerator.getDefault();//randomising engine
        int userGuessedNumber = userGen.nextInt(0,37);
        this.userChosenNum = userGuessedNumber;
        return userGuessedNumber;
        }
    }
}


    // casinoUsers.stream()                            // 1. Put everyone on the conveyor belt
    //        .filter(u -> u.getWallet() > 1000)   // 2. Knock off anyone with less than R1000
    //        .forEach(u -> System.out.println(u));// 3. Print whoever is left at the end

// class UserB{

//     int userBChosenNum;
//     private double userBBal;

//     //getters and setters
//     public double getUserABal(){
//         return this.userBBal;
//     }
//     public void setUserBBal(double userBBal){
//         if(userBBal >=0){
//             this.userBBal = userBBal;
//         }
//     } 

    
//     public UserB(double userBBal){
//     if(userBBal >= 0){
//         this.userBBal = userBBal;
//         } else{
//             System.out.println("Error: Value cannot be a negative value");
//         } 
//     }
//         int userBGeneratedNum(){
//         RandomGenerator userBGen = RandomGenerator.getDefault();//randomising engine
//         int userBGuessedNumber = userBGen.nextInt(0,37);
//         this.userBChosenNum = userBGuessedNumber;
//         return userBGuessedNumber;
//         }
//     }

// For User input:
// Import:import java.util.Scanner;

// Scanner input = new Scanner(System.in);
// 3. How do you instantiate it?When you write Scanner input = new Scanner(System.in);, you are passing an argument into the Scanner constructor:System.in: This tells the scanner to plug its intake pipe directly into the standard computer keyboard input feed.Alternative Inputs: The scanner is highly versatile. You could pass a file object instead: new Scanner(new File("scores.txt")). It will read the file exactly the same way it reads a keyboard!


// Notes:
// 1. When to use scanner.nextInt() 🎯You use input.nextInt() only when you explicitly expect the user to type a whole number (an integer) that your code needs to immediately use in a math calculation, a game score comparison, or an array index lookup.Examples: Asking for a user's age, their roulette number guess (0-36), or how much cash they want to bet.2. Dealing with Strings instead of Integers 📝If you want the user to type text (like their name, a secret password, or a choice like "yes"/"no"), you are banned from using .nextInt(). Instead, the Scanner toolbox gives you two specialized text-handling buttons:Option A: Use .next() (Fetches ONE single word)This button reads the input stream and stops scanning the absolute microsecond it hits a blank space.javaScanner input = new Scanner(System.in);
// System.out.print("Enter your first name: ");

// String firstName = input.next(); // 🏃 Stops at the first space!
// Use code with caution.How it behaves: If the user types "Kanyisa" and hits Enter, firstName becomes "Kanyisa". But if they type "Kanyisa Smith", the button only grabs "Kanyisa" and leaves "Smith" trapped inside the keyboard feed pipe!Option B: Use .nextLine() (Fetches the WHOLE sentence)This button reads everything the user types, including spaces, and only stops scanning when the user physically hits the Enter key.javaScanner input = new Scanner(System.in);
// System.out.print("Enter your full name and surname: ");

// String fullName = input.nextLine(); // 📄 Reads the entire line!
// Use code with caution.How it behaves: If the user types "Kanyisa Smith" and hits Enter, fullName perfectly captures the entire string "Kanyisa Smith" with the space included.🚨 The Dreaded "Scanner Skip" Bug (Critical Warning!)If you mix .nextInt() and .nextLine() inside the same method, you will run into the most famous trap in the Java language. Look at this realistic problem scenario:javaScanner input = new Scanner(System.in);

// System.out.print("Enter your age: ");
// int age = input.nextInt(); // User types 25 and hits Enter

// System.out.print("Enter your city: ");
// String city = input.nextLine(); // ❌ BUG: Java skips this completely! You cannot type!
// Use code with caution.Why did Java skip it?When the user typed 25 and pressed Enter, they actually sent two things into the memory stream: the characters 2 and 5, followed by an invisible "Newline character" (\n) caused by hitting the Enter key.input.nextInt() stepped up, grabbed the 25, and stopped. It left the invisible Enter key (\n) sitting inside the pipe!Next, your code hit input.nextLine(). This button's only rule is: "Read until you hit an Enter key." It looked at the pipe, instantly spotted the leftover Enter key from the previous line, thought you were finished, grabbed it, and moved on without letting you type a single letter!

//  How to fix it perfectly:Whenever you read a number using nextInt(), you must immediately write a dummy input.nextLine(); right below it. This acts as a vacuum cleaner line to suck up and destroy that trapped Enter key before it corrupts your string questions:javaSystem.out.print("Enter your age: ");
// int age = input.nextInt(); 

// input.nextLine(); // 🧼 VACUUM CLEANER LINE: Clears out the trapped Enter key!

// System.out.print("Enter your city: ");
// String city = input.nextLine(); // ✅ Works perfectly now! You can type your city



// NIO Files utility
