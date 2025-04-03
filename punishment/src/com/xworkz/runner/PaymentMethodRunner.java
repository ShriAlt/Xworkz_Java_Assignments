package com.xworkz.runner;

import com.xworkz.internal.*;

public class PaymentMethodRunner {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        creditCard.initiatePayment();
        creditCard.validateTransaction();
        creditCard.processRefund();
        creditCard.checkBalance();
        creditCard.generateReceipt();

        DebitCard debitCard = new DebitCard();
        debitCard.initiatePayment();
        debitCard.validateTransaction();
        debitCard.processRefund();
        debitCard.checkBalance();
        debitCard.generateReceipt();

        PayPal payPal = new PayPal();
        payPal.initiatePayment();
        payPal.validateTransaction();
        payPal.processRefund();
        payPal.checkBalance();
        payPal.generateReceipt();

        GooglePay googlePay = new GooglePay();
        googlePay.initiatePayment();
        googlePay.validateTransaction();
        googlePay.processRefund();
        googlePay.checkBalance();
        googlePay.generateReceipt();

        ApplePay applePay = new ApplePay();
        applePay.initiatePayment();
        applePay.validateTransaction();
        applePay.processRefund();
        applePay.checkBalance();
        applePay.generateReceipt();

        Bitcoin bitcoin = new Bitcoin();
        bitcoin.initiatePayment();
        bitcoin.validateTransaction();
        bitcoin.processRefund();
        bitcoin.checkBalance();
        bitcoin.generateReceipt();

        BankTransfer bankTransfer = new BankTransfer();
        bankTransfer.initiatePayment();
        bankTransfer.validateTransaction();
        bankTransfer.processRefund();
        bankTransfer.checkBalance();
        bankTransfer.generateReceipt();

        Cash cash = new Cash();
        cash.initiatePayment();
        cash.validateTransaction();
        cash.processRefund();
        cash.checkBalance();
        cash.generateReceipt();

        GiftCard giftCard = new GiftCard();
        giftCard.initiatePayment();
        giftCard.validateTransaction();
        giftCard.processRefund();
        giftCard.checkBalance();
        giftCard.generateReceipt();

        Crypto crypto = new Crypto();
        crypto.initiatePayment();
        crypto.validateTransaction();
        crypto.processRefund();
        crypto.checkBalance();
        crypto.generateReceipt();

        System.out.println("============================================");
        PaymentMethod payment1 = new CreditCard();
        payment1.initiatePayment();
        payment1.validateTransaction();
        payment1.processRefund();
        payment1.checkBalance();
        payment1.generateReceipt();

        PaymentMethod payment2 = new DebitCard();
        payment2.initiatePayment();
        payment2.validateTransaction();
        payment2.processRefund();
        payment2.checkBalance();
        payment2.generateReceipt();

        PaymentMethod payment3 = new PayPal();
        payment3.initiatePayment();
        payment3.validateTransaction();
        payment3.processRefund();
        payment3.checkBalance();
        payment3.generateReceipt();

        PaymentMethod payment4 = new GooglePay();
        payment4.initiatePayment();
        payment4.validateTransaction();
        payment4.processRefund();
        payment4.checkBalance();
        payment4.generateReceipt();

        PaymentMethod payment5 = new ApplePay();
        payment5.initiatePayment();
        payment5.validateTransaction();
        payment5.processRefund();
        payment5.checkBalance();
        payment5.generateReceipt();

        PaymentMethod payment6 = new Bitcoin();
        payment6.initiatePayment();
        payment6.validateTransaction();
        payment6.processRefund();
        payment6.checkBalance();
        payment6.generateReceipt();

        PaymentMethod payment7 = new BankTransfer();
        payment7.initiatePayment();
        payment7.validateTransaction();
        payment7.processRefund();
        payment7.checkBalance();
        payment7.generateReceipt();

        PaymentMethod payment8 = new Cash();
        payment8.initiatePayment();
        payment8.validateTransaction();
        payment8.processRefund();
        payment8.checkBalance();
        payment8.generateReceipt();

        PaymentMethod payment9 = new GiftCard();
        payment9.initiatePayment();
        payment9.validateTransaction();
        payment9.processRefund();
        payment9.checkBalance();
        payment9.generateReceipt();

        PaymentMethod payment10 = new Crypto();
        payment10.initiatePayment();
        payment10.validateTransaction();
        payment10.processRefund();
        payment10.checkBalance();
        payment10.generateReceipt();
    }
}
