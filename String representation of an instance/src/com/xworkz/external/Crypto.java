package com.xworkz.external;

import com.xworkz.internal.PaymentMethods;

public class Crypto extends PaymentMethods {
    private String name;
    private int cardNo;
    private int date;
    public Crypto(String name,int cardNo,int date){
        this.cardNo=cardNo;
        this.date=date;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Crypto{" +
                "name='" + name + '\'' +
                ", cardNo=" + cardNo +
                ", date=" + date +
                '}';
    }
}
