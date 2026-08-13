public class PaymentProcesssorAppJava21 {

    //only for the purpose of instanceof...that's why we used the generic Object, so we can cast it
    //For Java 21 you can just write void main() {...}, and not wrap the code is a class, and not write public static void main...
    
    public static void main(String[] args) {

        PaymentProcesssorAppJava21 ppAppJava21 = new PaymentProcesssorAppJava21();

        // 1. Create a specific payment object
        CreditCard cardPayment = new CreditCard();

         // 2. Put it inside a generic "Object" box (this simulates receiving a generic payload)
         Object paymentPayload = cardPayment;

         // 3. Pass the generic box into our processor method
          ppAppJava21.processPayment(paymentPayload);


    }

    // public void processPayment(Object payment){
    //     // STEP 1: The Check (Is the object a type of CreditCard?)
    //     if (payment instanceof CreditCard){
    //         CreditCard cc = (CreditCard) payment;
    //         cc.chargeCard();
    //     }
    //     if (payment instanceof PayPal){
    //         PayPal pp = (PayPal) payment;
    //         pp.loginAndPay();
    //     }
//     // }
// }

//JAVA 21 REWRITES THIS PART USING THE Pattern Matching with a Switch Expression!
 // It checks the type, creates the remote, and executes the action in one shot.
    void processPayment(Object payment){
    switch (payment) {
        case CreditCard cc -> cc.chargeCard();
        case PayPal pp -> pp.loginAndPay();
        case null -> System.out.println("Error: Payment payload is empty!");
        default -> System.out.println("Error: Unknown payment type!");
    }
 } 


 //Now the below classes change to records

    // --- HELPER BLUEPRINT CLASSES ---
// (In Java 5, these had to be separate classes with their actions)
    // Simple CreditCard implementation so the type is available
    // class CreditCard {
    //     void chargeCard() {
    //         System.out.println("Card charged");
    //     }
    // }
    // class PayPal {
    //     public void loginAndPay(){
    //         System.out.println("Casting successful! Logging into PayPal gateway...");
    //     }
    // }

    record CreditCard() {
        void chargeCard() {
            System.out.println("Card charged");
        }
    }
    record PayPal() {
        public void loginAndPay(){
            System.out.println("Casting successful! Logging into PayPal gateway...");
        }
    }
}
