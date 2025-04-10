package com.xworkz.external;

import com.xworkz.internal.ElectronicDevice;

public class Monitor extends ElectronicDevice {
    private String name;
    private int price;
    private int quantity;

    public Monitor(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 45698;
    }
}
