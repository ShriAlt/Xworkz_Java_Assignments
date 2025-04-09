package com.xworkz.external;

import com.xworkz.internal.Tools;

public class Drill extends Tools {
    private int quantity;
    private String name;
    private String type;
    public Drill(String name,String type,int quantity){
        this.name=name;
        this.type=type;
        this.quantity=quantity;
    }

    @Override
    public String toString() {
        return "Drill{" +
                "quantity=" + quantity +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
