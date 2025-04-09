package com.xworkz.external;

import com.xworkz.internal.PaymentMethods;

public class ApplePay extends PaymentMethods {
    private String name;
    private int cardNo;
    private int date;
    public ApplePay(String name,int cardNo,int date){
        this.cardNo=cardNo;
        this.date=date;
        this.name=name;
    }

    @Override
    public String toString() {
        return "ApplePay{" +
                "name='" + name + '\'' +
                ", cardNo=" + cardNo +
                ", date=" + date +
                '}';
    }
}
