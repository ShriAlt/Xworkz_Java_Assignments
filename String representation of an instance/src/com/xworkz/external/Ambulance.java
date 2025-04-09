package com.xworkz.external;

import com.xworkz.internal.Vehical;

public class Ambulance extends Vehical {
    private String color;
    private int wheels;
    private int price;
    public Ambulance(String color,int wheels,int price){
        this.color=color;
        this.price=price;
        this.wheels=wheels;
    }

    @Override
    public String toString() {
        return "Ambulance{" +
                "color='" + color + '\'' +
                ", wheels=" + wheels +
                ", price=" + price +
                '}';
    }
}
