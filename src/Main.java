import core.*;

public class Main {
    public static void main(String[] args) {
        // Creating a finance manager to track transactions
        FinanceManager financeManager = new FinanceManager();
        
        // Adding some transactions (Expense, Income, Investment)
        financeManager.addTransaction(new Expense("Rent", "Monthly house rent", 1200.00, "2024-09-01"));
        financeManager.addTransaction(new Income("Salary", "Monthly salary", 3000.00, "2024-09-05"));
        financeManager.addTransaction(new Investment("Stocks", "Investment in stocks", 5000.00, "2024-09-10"));

        // Displaying the transactions
        financeManager.displayTransactionDetails();

        // Displaying static member info for Investment class
        System.out.println("Total Investments Created: " + Investment.getTotalCreated());
        System.out.println("Total Investments Deleted: " + Investment.getTotalDeleted());

        // Creating a user and displaying user details
        User user = new User("john_doe", "john@example.com", "securepassword");
        user.displayUserDetails();

        // Forcing garbage collection (to trigger finalize() and simulate deletion)
        System.gc();

        // Give time for garbage collection to happen
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Displaying total after GC
        System.out.println("After GC:");
        System.out.println("Total Investments Deleted: " + Investment.getTotalDeleted());
    }
}