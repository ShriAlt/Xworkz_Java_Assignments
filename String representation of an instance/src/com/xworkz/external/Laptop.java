package com.xworkz.external;

import com.xworkz.internal.ElectronicDevice;

public class Laptop extends ElectronicDevice {
    private String name;
    private int price;
    private int quantity;

    public Laptop(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
