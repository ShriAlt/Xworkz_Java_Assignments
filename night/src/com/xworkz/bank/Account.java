package com.xworkz.bank;

public class Account {
    private String accountNumber;
    double balance;
    public boolean type;
//    public Account(String accountNumber, double balance,boolean type) {
//        this.accountNumber = accountNumber;
//        this.balance = balance;
//        this.type=type;
//    }

    private void showAccountDetails() {
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Balance: ₹" + this.balance);
        System.out.println("Type:"+this.type);
    }

    public void displayAccount() {
        System.out.println("Displaying Account Details:");
        showAccountDetails();
    }
}
