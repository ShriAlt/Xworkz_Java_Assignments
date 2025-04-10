package com.xworkz.external;

import com.xworkz.internal.PaymentMethods;

public class PayPal extends PaymentMethods {
    private String name;
    private int cardNo;
    private int date;
    public PayPal(String name,int cardNo,int date){
        this.cardNo=cardNo;
        this.date=date;
        this.name=name;
    }

    @Override
    public String toString() {
        return "PayPal{" +
                "name='" + name + '\'' +
                ", cardNo=" + cardNo +
                ", date=" + date +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 7416;
    }
}
