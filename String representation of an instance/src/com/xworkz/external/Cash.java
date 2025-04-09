package com.xworkz.external;

import com.xworkz.internal.PaymentMethods;

public class Cash extends PaymentMethods {
    private String name;
    private int cardNo;
    private int date;
    public Cash(String name,int cardNo,int date){
        this.cardNo=cardNo;
        this.date=date;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Cash{" +
                "name='" + name + '\'' +
                ", cardNo=" + cardNo +
                ", date=" + date +
                '}';
    }
}
