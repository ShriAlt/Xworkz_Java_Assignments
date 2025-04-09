package com.xworkz.external;

import com.xworkz.internal.ElectronicDevice;

public class TV extends ElectronicDevice {
    private String name;
    private int price;
    private int quantity;

    public TV(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "TV{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
