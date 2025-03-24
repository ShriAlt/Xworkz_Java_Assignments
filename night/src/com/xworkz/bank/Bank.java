package com.xworkz.bank;

public class Bank {
        private String bankName="union bank";
        public  String branch;
        String location;
        Customer customer;
    public void displayBank() {
        System.out.println("Display the bank details:");
        System.out.println("Bank Name: " + this.bankName);
        System.out.println("Location: " + this.location);
        System.out.println("Branch: " + this.branch);
        System.out.println("...........................................");


        if (customer != null) {
            customer.displayCustomer();
            customer.customerStatus="done";
            customer.age=56;
            Account account=new Account();
            customer.account=account;
            account.balance=67777;
            account.type=true;

        } else {
            System.out.println("No Customers Available.");
        }
    }
}
