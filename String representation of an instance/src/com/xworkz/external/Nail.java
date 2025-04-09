package com.xworkz.external;

import com.xworkz.internal.Tools;

public class Nail extends Tools {
    private int quantity;
    private String name;
    private String type;
    public Nail(String name,String type,int quantity){
        this.name=name;
        this.type=type;
        this.quantity=quantity;
    }

    @Override
    public String toString() {
        return "Nail{" +
                "quantity=" + quantity +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
