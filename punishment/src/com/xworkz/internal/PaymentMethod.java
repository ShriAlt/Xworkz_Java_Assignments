package com.xworkz.internal;

public class PaymentMethod {
    public PaymentMethod(){
        System.out.println("no args const of paymenth method");
    }

    public void initiatePayment() {
        System.out.println("Initiating payment.");
    }

    public void validateTransaction() {
        System.out.println("Validating transaction.");
    }

    public void processRefund() {
        System.out.println("Processing refund.");
    }

    public void checkBalance() {
        System.out.println("Checking balance.");
    }

    public void generateReceipt() {
        System.out.println("Generating receipt.");
    }
}
