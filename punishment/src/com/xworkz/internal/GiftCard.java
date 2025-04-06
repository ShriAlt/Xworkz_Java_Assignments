package com.xworkz.internal;

public class GiftCard extends PaymentMethod{
    @Override
    public void initiatePayment() {
        System.out.println("Initiating payment.(Override)");
    }
    @Override
    public void validateTransaction() {
        System.out.println("Validating transaction.(Override)");
    }
    @Override
    public void processRefund() {
        System.out.println("Processing refund.(Override)");
    }
    @Override
    public void checkBalance() {
        System.out.println("Checking balance.(Override)");
    }
    @Override
    public void generateReceipt() {
        System.out.println("Generating receipt.(Override)");
    }
}
