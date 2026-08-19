// ----------------------------------------------------
// THE PHONE CLASS BLUEPRINT
// ----------------------------------------------------
class Phone {
    private String model;
    private String color;

    // Constructor to build a new Phone object
    public Phone(String model, String color) {
        this.model = model;
        this.color = color;
    }

    // Overriding the default equals method
    @Override
    public boolean equals(Object obj) {
        // STEP 1: The Remote Check (Aliasing Shortcut)
        if (this == obj) {
            System.out.println("[Step 1 Triggered]: Same remote! Exiting early.");
            return true;
        }

        // STEP 2: The Safety Gate (Null & Type check)
        if (obj == null || this.getClass() != obj.getClass()) {
            System.out.println("[Step 2 Triggered]: Object is null or wrong type! Exiting early.");
            return false;
        }

        // STEP 3: Reference Casting (Downcasting)
        Phone otherPhone = (Phone) obj;

        // STEP 4: The Final Field Comparison (Using your clear if-else logic)
        if (!this.model.equals(otherPhone.model)) {
            System.out.println("[Step 4 Triggered]: Models do not match!");
            return false; 
        } 
        else if (!this.color.equals(otherPhone.color)) {
            System.out.println("[Step 4 Triggered]: Colors do not match!");
            return false;
        } 
        else {
            System.out.println("[Step 4 Triggered]: Everything matches perfectly!");
            return true;
        }
    }
}

// ----------------------------------------------------
// THE MAIN EXECUTABLE CLASS
// ----------------------------------------------------
public class EqualityCheck {
    public static void main(String[] args) {
        System.out.println("--- STARTING EQUALS TESTS ---\n");

        // Test Scenario A: Completely identical data, but separate objects
        Phone phone1 = new Phone("iPhone 16", "Black");
        Phone phone2 = new Phone("iPhone 16", "Black");

        System.out.println("Comparing phone1 and phone2 (Separate boxes, same data):");
        boolean resultA = phone1.equals(phone2);
        System.out.println("Final Result: " + resultA + "\n");


        // Test Scenario B: Different data entirely
        Phone phone3 = new Phone("Samsung S24", "White");

        System.out.println("Comparing phone1 and phone3 (Different data):");
        boolean resultB = phone1.equals(phone3);
        System.out.println("Final Result: " + resultB + "\n");


        // Test Scenario C: Same exact remote control instance (Aliasing)
        Phone phone4 = phone1; 

        System.out.println("Comparing phone1 and phone4 (Exact same remote control alias):");
        boolean resultC = phone1.equals(phone4);
        System.out.println("Final Result: " + resultC + "\n");
    }
}
