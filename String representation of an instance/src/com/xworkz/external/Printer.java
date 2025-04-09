package com.xworkz.external;

import com.xworkz.internal.ElectronicDevice;

public class Printer extends ElectronicDevice {
    private String name;
    private int price;
    private int quantity;

    public Printer(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Printer{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
