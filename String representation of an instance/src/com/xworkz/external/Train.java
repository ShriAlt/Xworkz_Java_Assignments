package com.xworkz.external;

import com.xworkz.internal.Vehical;

public class Train extends Vehical {
    private String color;
    private int wheels;
    private int price;
    public Train(String color,int wheels,int price){
        this.color=color;
        this.price=price;
        this.wheels=wheels;
    }

    @Override
    public String toString() {
        return "Train{" +
                "color='" + color + '\'' +
                ", wheels=" + wheels +
                ", price=" + price +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 3598;
    }
}
