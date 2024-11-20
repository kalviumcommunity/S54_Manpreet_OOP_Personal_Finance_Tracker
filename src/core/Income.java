package core;

public class Income extends Transaction {
    public Income(String title, String description, double amount, String date) {
        super(title, description, amount, date);
    }

    @Override
    public String getTransactionType() {
        return "Income";
    }
}
