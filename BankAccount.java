public class BankAccount {
    private double balance;
    private String accountHolderName;

    // Constructor
    public BankAccount(String accountHolderName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid amount. Please enter a positive number.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid amount or insufficient balance.");
        }
    }

    // Method to check balance
    public double getBalance() {
        return balance;
    }

    // Method to get account holder's name
    public String getAccountHolderName() {
        return accountHolderName;
    }
}
