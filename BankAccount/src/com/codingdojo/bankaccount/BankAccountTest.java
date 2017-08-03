package com.codingdojo.bankaccount;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();

        System.out.println(b.getAccountNumber());
        b.deposit("checking", 100000);
        b.deposit("checking", 1999);

        System.out.println(b.accountBalance());
        b.deposit("saving", 100);
        b.deposit("saving", 665);
        System.out.println(b.getSavingBalance());
        System.out.println(b.accountBalance());
        System.out.println(b.getTotalMoney());

        // TEST
        System.out.println("*************");
        System.out.println(b.getCheckingBalance());
        System.out.println("*************");
    }

}
