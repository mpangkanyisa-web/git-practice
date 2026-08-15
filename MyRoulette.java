import java.util.List;
import java.util.random.RandomGenerator;

public class MyRoulette {
    // am going to need Users
    //We gonna use a RandomGenerator instead of Math.randm()
    // import java.util.random.RandomGenerator; // 1. Import the modern generator tool
    int casinoNum;
    
    private double machineCashBalance; //non-static to keep it private

    
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

