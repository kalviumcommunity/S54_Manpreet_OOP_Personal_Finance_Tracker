package core;

public class Investment extends Transaction {
    // Static variables to track total created and deleted transactions
    private static int totalCreated = 0;
    private static int totalDeleted = 0;

    // Constructor for Investment
    public Investment(String title, String description, double amount, String date) {
        super(title, description, amount, date);
        // Increment totalCreated when an object is instantiated
        totalCreated++;
    }

    // Static method to get total created transactions
    public static int getTotalCreated() {
        return totalCreated;
    }

    // Static method to get total deleted transactions
    public static int getTotalDeleted() {
        return totalDeleted;
    }

    // Overriding the finalize method to simulate object deletion
    @Override
    protected void finalize() throws Throwable {
        try {
            // Increment totalDeleted when the object is garbage collected
            totalDeleted++;
        } finally {
            super.finalize();
        }
    }

    // Overriding the display method
    @Override
    public void displayTransactionDetails() {
        System.out.println("[Investment]");
        super.displayTransactionDetails();
    }
}