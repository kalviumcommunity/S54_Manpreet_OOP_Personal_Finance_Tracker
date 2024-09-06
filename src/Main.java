import core.*;

public class Main {
    public static void main(String[] args){
        FinanceManager financeManager = new FinanceManager();
        Expense rentExpense = new Expense("Rent", "Monthly house rent", 1200.00, "2024-09-01");
        financeManager.addTransaction(rentExpense);
        financeManager.displayTransactionDetails();

        Income newIncome = new Income(null, null, 0, null);
        financeManager.addTransaction(newIncome);
        financeManager.displayTransactionDetails();



    }
}