package com.xworkz.external;

import com.xworkz.internal.Tools;

public class Chisel extends Tools {
    private int quantity;
    private String name;
    private String type;
    public Chisel(String name,String type,int quantity){
        this.name=name;
        this.type=type;
        this.quantity=quantity;
    }

    @Override
    public String toString() {
        return "Chisel{" +
                "quantity=" + quantity +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
