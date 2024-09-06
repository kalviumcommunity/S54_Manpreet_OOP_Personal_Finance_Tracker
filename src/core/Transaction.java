package core;

public class Transaction {
    private String title;
    private String description;
    private double amount;
    private String date;

    public Transaction(String title, String description, double amount, String date) {
        this.title = title;
        this.description = description;
        this.amount = amount;
        this.date = date;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void displayTransactionDetails() {
        System.out.println("Transaction: " + title + "\nDescription: " + description + "\nAmount: $" + amount + "\nDate: " + date);
    }
}