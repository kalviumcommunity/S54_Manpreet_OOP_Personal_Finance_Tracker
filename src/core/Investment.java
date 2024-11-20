package core;

public class Investment extends Transaction {
    private static int totalCreated = 0;
    private static int totalDeleted = 0;

    public Investment(String title, String description, double amount, String date) {
        super(title, description, amount, date);
        totalCreated++;
    }

    // Implement abstract method
    @Override
    public double calculateFee() {
        // Example: 1% fee for an investment transaction
        return getAmount() * 0.01;
    }

    // Override display method
    @Override
    public void displayTransactionDetails() {
        System.out.println("[Investment]");
        super.displayTransactionDetails();
        System.out.println("Fee: $" + calculateFee());
    }

    // Finalize to track deletions
    @Override
    protected void finalize() throws Throwable {
        try {
            totalDeleted++;
        } finally {
            super.finalize();
        }
    }

    // Static methods for tracking
    public static int getTotalCreated() {
        return totalCreated;
    }

    public static int getTotalDeleted() {
        return totalDeleted;
    }
}
