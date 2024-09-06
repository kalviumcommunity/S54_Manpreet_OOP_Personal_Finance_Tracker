import core.*;

public class Main {
    public static void main(String[] args) {
        // Creating a finance manager that will keep a record of all transactions
        FinanceManager financeManager = new FinanceManager();
        
        // Creating a demo expense (e.g., Rent)
        Transaction rentExpense = new Expense("Rent", "Monthly house rent", 1200.00, "2024-09-01");
        financeManager.addTransaction(rentExpense);
        
        // Creating a demo income (e.g., Salary)
        Transaction salaryIncome = new Income("Salary", "Monthly salary", 3000.00, "2024-09-05");
        financeManager.addTransaction(salaryIncome);
        
        // Display all transactions stored inside the finance manager
        financeManager.displayTransactionDetails();

        // Initializing a transaction array to demonstrate array of objects concept
        Transaction[] transactions = new Transaction[3];

        // Creating sample objects to add to the array
        transactions[0] = new Expense("Groceries", "Buying vegetables and fruits", 100.00, "2024-09-08");
        transactions[1] = new Income("Freelance", "Payment for freelance work", 500.00, "2024-09-07");
        transactions[2] = new Expense("Electricity Bill", "Monthly utility payment", 150.00, "2024-09-10");

        // Displaying transaction details from the array
        for (Transaction transaction : transactions) {
            transaction.displayTransactionDetails();
            System.out.println("-----------------------");
        }
    }
}