package com.xworkz.external;

import com.xworkz.internal.Vehical;

public class Scooter extends Vehical {
    private String color;
    private int wheels;
    private int price;
    public Scooter(String color,int wheels,int price){
        this.color=color;
        this.price=price;
        this.wheels=wheels;
    }

    @Override
    public String toString() {
        return "Scooter{" +
                "color='" + color + '\'' +
                ", wheels=" + wheels +
                ", price=" + price +
                '}';
    }
}
