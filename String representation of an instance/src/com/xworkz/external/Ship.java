package com.xworkz.external;

import com.xworkz.internal.Vehical;

public class Ship extends Vehical {
    private String color;
    private int wheels;
    private int price;
    public Ship(String color,int wheels,int price){
        this.color=color;
        this.price=price;
        this.wheels=wheels;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "color='" + color + '\'' +
                ", wheels=" + wheels +
                ", price=" + price +
                '}';
    }
}
