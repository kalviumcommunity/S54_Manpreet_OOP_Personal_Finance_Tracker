package core;

public class StockInvestment extends Investment implements Taxable {
    private double taxRate; // Percentage tax rate, e.g., 10 for 10%

    // Constructor
    public StockInvestment(String title, String description, double amount, String date, double taxRate) {
        super(title, description, amount, date);
        this.taxRate = taxRate;
    }

    // Getter and setter for taxRate
    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    // Implementing calculateTax from the Taxable interface
    @Override
    public double calculateTax() {
        return getAmount() * (taxRate / 100); // Calculate tax as a percentage of the amount
    }

    // Overriding the display method to include tax details
    @Override
    public void displayTransactionDetails() {
        super.displayTransactionDetails();
        System.out.println("Tax Rate: " + taxRate + "%\nCalculated Tax: $" + calculateTax());
    }
}
