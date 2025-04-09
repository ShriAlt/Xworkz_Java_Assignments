package com.xworkz.external;

import com.xworkz.internal.Tools;

public class Wrench extends Tools {
    private int quantity;
    private String name;
    private String type;
    public Wrench(String name,String type,int quantity){
        this.name=name;
        this.type=type;
        this.quantity=quantity;
    }

    @Override
    public String toString() {
        return "Wrench{" +
                "quantity=" + quantity +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
