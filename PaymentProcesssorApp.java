public class PaymentProcesssorApp {

    //only for the purpose of instanceof...that's why we used the generic Object, so we can cast it
    public static void main(String[] args) {

        PaymentProcesssorApp ppApp = new PaymentProcesssorApp();

        // 1. Create a specific payment object
        CreditCard cardPayment = new CreditCard();

         // 2. Put it inside a generic "Object" box (this simulates receiving a generic payload)
         Object paymentPayload = cardPayment;

         // 3. Pass the generic box into our processor method
          ppApp.processPayment(paymentPayload);


    }

    public void processPayment(Object payment){
        // STEP 1: The Check (Is the object a type of CreditCard?)
        if (payment instanceof CreditCard){
            CreditCard cc = (CreditCard) payment;
            cc.chargeCard();
        }
        if (payment instanceof PayPal){
            PayPal pp = (PayPal) payment;
            pp.loginAndPay();
        }
    }
}

    // --- HELPER BLUEPRINT CLASSES ---
// (In Java 5, these had to be separate classes with their actions)
    // Simple CreditCard implementation so the type is available
    class CreditCard {
        void chargeCard() {
            System.out.println("Card charged");
        }
    }
    class PayPal {
        public void loginAndPay(){
            System.out.println("Casting successful! Logging into PayPal gateway...");
        }
    }

