package core;

public class Expense extends Transaction {
    public Expense(String title, String description, double amount, String date) {
        super(title, description, amount, date);
    }

    @Override
    public void displayTransactionDetails() {
        System.out.println("[Expense]");
        super.displayTransactionDetails();
    }
}