package com.bnmit;

class BankAccount {
    String name;
    double balance;

    BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid");
        }
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Invalid");
        } else if (amount <= 0) {
            System.out.println("Invalid");
        } else {
            balance -= amount;
            System.out.println("Withdraw: " + amount);
        }
    }
}

public class BankService {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Sp", 500);
        acc.deposit(300);
        acc.withdraw(30);
        System.out.println("Balance: " + acc.balance);
    }
}
