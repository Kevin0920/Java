package com.codingdojo.bankaccount;

public class BankAccount {

    private String accountNumber;
    private double checkingBalance = 0;
    private double savingBalance = 0;

    private static int numberOfAccounts = 0;
    private static double totalMoney = 0;

    // setting bank account as constructor

    public BankAccount() {
        this.accountNumber = generateAccount();

        //incrementing the account
        numberOfAccounts++;
    }

    private String generateAccount() {
        String account = "";
        int max = 10;
        int min = 0;

        for (int i = 0; i < 10; i++) {
            int random = (int) (Math.random() * max + min);
            account = account.concat(String.valueOf(random));
        }
        return account;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;

    }

    public void deposit(String accountType, double amount) {
        String account = accountType.toLowerCase();

        if (account.equals("checking")) {
            totalMoney += amount;
        }
        else if (account.equals("saving")) {
            totalMoney += amount;
        }
        else {
            System.out.println("We can't find you account information");
        }
    }

    public void withdraw(String accountType, double amount) {
        String account = accountType.toLowerCase();

        if (account.equals("checking")) {
            if (this.checkingBalance - amount < 0) {
                System.out.println("You have no money");
            }
            else {
                this.checkingBalance -= amount;
                totalMoney -= amount;
            }
        }
        else if (account.equals("saving")) {
            if (this.savingBalance - amount < 0) {
                System.out.println("You have no money left in saving amount");
            }
            else {
                this.savingBalance -= amount;
                totalMoney -= amount;
            }
        }
        else {
            System.out.println("We can't find you account information");
        }
    }

    public double accountBalance() {
        double total = this.savingBalance + this.checkingBalance;
        return total;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public static int getNumberOfAccounts() {
        return numberOfAccounts;
    }




}
