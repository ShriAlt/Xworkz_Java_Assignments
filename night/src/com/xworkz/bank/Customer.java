package com.xworkz.bank;

public class Customer {
    private String customerName ="harsha";
    int age;
    public String customerStatus;
    Account account;
    void displayCustomer() {
        Bank bank=new Bank();
        bank.location="Dakshina Kannada";
        account.type=true;
        account.displayAccount();
        account.balance=78;
        System.out.println("Display the customer details:");
        System.out.println("Customer Name: " + this.customerName);
        System.out.println("Age: " + this.age);
        System.out.println("Customer Status: " + this.customerStatus);
        System.out.println("...........................................");

        if (account != null) {
            account.displayAccount();
        } else {
            System.out.println("No Bank Account Assigned.");
        }
    }

}
