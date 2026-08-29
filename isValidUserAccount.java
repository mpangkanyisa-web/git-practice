public class isValidUserAccount {
    private String username;
    private int loyaltyPoints; // Constraint: Must be >= 0

    // Gatekeeper Setter
    public void setLoyaltyPoints(int points) {
        if (!isValidPoints(points)) {
            throw new IllegalArgumentException("Points cannot be negative!");
        }
        this.loyaltyPoints = points;
    }

    // Encapsulated Validation Logic
    private boolean isValidPoints(int points) {
        return points >= 0; 
    }
}
