import core.*;

public class Main {
    public static void main(String[] args) {
        // Create a user
        User user = new User("john_doe", "john@example.com", "securepassword");
        user.displayUserDetails();

        // Check user password validity
        System.out.println("Password valid: " + user.isValidPassword("securepassword"));
        System.out.println("Password valid: " + user.isValidPassword("wrongpassword"));

        // Create a FinanceManager to track transactions
        FinanceManager financeManager = new FinanceManager();

        // Add some transactions (Expense, Income, Investment)
        financeManager.addTransaction(new Expense("Rent", "Monthly house rent", 1200.00, "2024-09-01"));
        financeManager.addTransaction(new Income("Salary", "Monthly salary", 3000.00, "2024-09-05"));
        financeManager.addTransaction(new Investment("Stocks", "Investment in stocks", 5000.00, "2024-09-10"));

        // Display all transactions
        System.out.println("\nAll Transactions:");
        financeManager.displayTransactionDetails();

        // Display transactions by type (e.g., "Expense")
        System.out.println("\nFiltered Transactions (Expense):");
        financeManager.displayTransactionsByType("Expense");

        // Calculate the total amount of all transactions
        System.out.println("\nTotal Amount of All Transactions: $" + financeManager.calculateTotalAmount());

        // Static member info for Investment class
        System.out.println("\nStatic Info for Investment:");
        System.out.println("Total Investments Created: " + Investment.getTotalCreated());
        System.out.println("Total Investments Deleted: " + Investment.getTotalDeleted());

        // Force garbage collection to simulate deletion and track `finalize` calls
        System.gc();

        // Give time for garbage collection to happen
        try {
            Thread.sleep(1000); // 1-second delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Display total investments deleted after garbage collection
        System.out.println("\nAfter Garbage Collection:");
        System.out.println("Total Investments Deleted: " + Investment.getTotalDeleted());
    }
}
