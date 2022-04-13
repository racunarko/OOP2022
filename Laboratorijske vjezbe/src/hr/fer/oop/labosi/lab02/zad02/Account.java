package hr.fer.oop.labosi.lab02.zad02;

abstract class Account {
    private double balance;
    private int transactions;

    Account(double balance) {
        this.balance = balance;
        this.transactions = 0;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getTransactions() {
        return transactions;
    }

    public void setTransactions(int transactions) {
        this.transactions = transactions;
    }

    public void deposit(double amount) {
        balance = balance + amount;
        transactions++;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
        transactions++;
    }

    public void onEndOfMonth() {
        endOfMonthCharge();
        transactions = 0;
    }

    public abstract void endOfMonthCharge();
}
