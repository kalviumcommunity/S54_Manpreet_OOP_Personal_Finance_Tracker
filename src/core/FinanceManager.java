package core;

import java.util.ArrayList;
import java.util.List;

public class FinanceManager {
    private List<Transaction> transactions;

    public FinanceManager() {
        this.transactions = new ArrayList<>();
    }

    // Add a transaction
    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    // Display all transactions
    public void displayTransactionDetails() {
        if (transactions.isEmpty()) {
            System.out.println("No transactions to display.");
        } else {
            for (Transaction transaction : transactions) {
                transaction.displayTransactionDetails();
                System.out.println("------------------");
            }
        }
    }

    // Calculate the total amount of all transactions
    public double calculateTotalAmount() {
        double total = 0;
        for (Transaction transaction : transactions) {
            total += transaction.getAmount();
        }
        return total;
    }

    // Filter transactions by type
    public void displayTransactionsByType(String type) {
        boolean found = false;
        for (Transaction transaction : transactions) {
            if (transaction.getTransactionType().equalsIgnoreCase(type)) {
                transaction.displayTransactionDetails();
                System.out.println("------------------");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No transactions found for type: " + type);
        }
    }
}
