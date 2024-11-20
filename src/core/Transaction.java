package core;

public abstract class Transaction {
    private String title;
    private String description;
    private double amount;
    private String date;

    // Constructor
    public Transaction(String title, String description, double amount, String date) {
        this.title = title;
        this.description = description;
        this.amount = amount;
        this.date = date;
    }

    // Abstract method for transaction type
    public abstract String getTransactionType();

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    // Display transaction details
    public void displayTransactionDetails() {
        System.out.println("[" + getTransactionType() + "]");
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
        System.out.println("Amount: $" + amount);
        System.out.println("Date: " + date);
    }
}
