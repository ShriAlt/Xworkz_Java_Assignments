package com.xworkz.external;

import com.xworkz.internal.Tools;

public class Tape extends Tools {

    private int quantity;
    private String name;
    private String type;
    public Tape(String name,String type,int quantity){
        this.name=name;
        this.type=type;
        this.quantity=quantity;
    }

    @Override
    public String toString() {
        return "Tape{" +
                "quantity=" + quantity +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
