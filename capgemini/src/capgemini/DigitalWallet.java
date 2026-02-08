package capgemini;

import java.util.*;

class Wallet {
    private double balance;
    private double dailyLimit;
    private ArrayList<String> transactions = new ArrayList<>();
    public Wallet() {
        balance = 0;
        dailyLimit = 0;
    }

    public void addMoney(double amount) {
        balance += amount;
        transactions.add("Added Rs" + amount);
        System.out.println("Money added successfully");
    }

    public void setDailyLimit(double limit) {
        dailyLimit = limit;
        System.out.println("Daily limit set to ₹" + limit);
    }


    public void transferMoney(double amount) {
        if (amount > dailyLimit) {
            System.out.println("Daily limit exceeded .Transfer failed");
            transactions.add("Transfer ₹" + amount + " failed ");
        } 
        else if (amount > balance) {
            System.out.println("Insufficient balance .Transfer failed");
            transactions.add("Transfer ₹" + amount + " failed ");
        } 
        else {
            balance -= amount;
            System.out.println("Transfer successful");
            transactions.add("Transferred ₹" + amount);
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: ₹" + balance);
    }

    public void viewTransactions() {
        System.out.println("Transaction History:");
        for (String t : transactions) {
            System.out.println(t);
        }
    }
}
public class DigitalWallet{
    public static void main(String[] args) {

        Wallet wallet = new Wallet();

        wallet.addMoney(10000);       
        wallet.setDailyLimit(5000);  
        wallet.checkBalance();
        wallet.viewTransactions();
}
}