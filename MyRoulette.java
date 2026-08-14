import java.util.random.RandomGenerator;

public class MyRoulette {
    // am going to need Users
    //We gonna use a RandomGenerator instead of Math.randm()
    // import java.util.random.RandomGenerator; // 1. Import the modern generator tool
    int casinoNum;
    int chosenNumA;
    int chosenNumB;
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

    MyRoulette r = new MyRoulette(1000);
    r.startGame();
}

void startGame(){

    System.out.println("Welcome to Roulette!");
    
    UserA uA = new UserA(500);
    UserB uB = new UserB(700);

    generateRandomNum(); //Generate the Casino Random Num
    uA.userAGeneratedNum();
    chosenNumA = uA.userAChosenNum;
    uB.userBGeneratedNum();
    chosenNumB = uB.userBChosenNum;
    compareNumbers();     
    }

    int generateRandomNum(){
        RandomGenerator numGen = RandomGenerator.getDefault();//randomising engine
        int targetedRouletteNumber = numGen.nextInt(0,37);
        this.casinoNum = targetedRouletteNumber;
        return targetedRouletteNumber;
    }
    void compareNumbers(){

        System.out.println("Wnning Number is " + casinoNum);


        if(chosenNumA == casinoNum) {
             System.out.println("A has chosen Number: " + chosenNumA);
            System.out.println("Congrats User A, you have won R100");
            }
            else {
                System.out.println("A has chosen Number: " + chosenNumA);
                System.out.println("Wrong Guess A");
            }
          
            if(chosenNumB == casinoNum ) {
                System.out.println("A has chosen Number: " + chosenNumB);
                System.out.println("Congrats User B, you have won R100");
            }
            else {
                 System.out.println("A has chosen Number: " + chosenNumB);
                System.out.println("Wrong Guess B");
            }
    }
    
}

class UserA{    
    int userAChosenNum;
    private double userABal;

    //getters and setters

    public double getUserABal(){
        return this.userABal;
    }
    public void setUserABal(double userABal){
        if(userABal >=0){
            this.userABal = userABal;
        }
    } 

   //Constructor     

    public UserA(double userABal){
    if(userABal >= 0){
        this.userABal = userABal;
        }  else{
            System.out.println("Error: Value cannot be a negative value");
        } 
    }

    int userAGeneratedNum(){
        RandomGenerator userAGen = RandomGenerator.getDefault();//randomising engine
        int userAGuessedNumber = userAGen.nextInt(0,37);
        this.userAChosenNum = userAGuessedNumber;
        return userAGuessedNumber;
        }
    }


class UserB{

    int userBChosenNum;
    private double userBBal;

    //getters and setters
    public double getUserABal(){
        return this.userBBal;
    }
    public void setUserBBal(double userBBal){
        if(userBBal >=0){
            this.userBBal = userBBal;
        }
    } 

    
    public UserB(double userBBal){
    if(userBBal >= 0){
        this.userBBal = userBBal;
        } else{
            System.out.println("Error: Value cannot be a negative value");
        } 
    }
        int userBGeneratedNum(){
        RandomGenerator userBGen = RandomGenerator.getDefault();//randomising engine
        int userBGuessedNumber = userBGen.nextInt(0,37);
        this.userBChosenNum = userBGuessedNumber;
        return userBGuessedNumber;
        }
    }

