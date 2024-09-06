package core;
import java.util.*;

public class FinanceManager {
    private List<Transaction> transactions;

    public FinanceManager() {
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public void displayTransactionDetails() {
        for(Transaction transaction : transactions) {
            transaction.displayTransactionDetails();
            System.out.println("------------------");
        }
    }
}