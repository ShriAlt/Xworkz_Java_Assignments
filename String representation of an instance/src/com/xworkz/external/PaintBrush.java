package com.xworkz.external;

import com.xworkz.internal.Tools;

public class PaintBrush extends Tools {
    private int quantity;
    private String name;
    private String type;
    public PaintBrush(String name,String type,int quantity){
        this.name=name;
        this.type=type;
        this.quantity=quantity;
    }

    @Override
    public String toString() {
        return "PaintBrush{" +
                "quantity=" + quantity +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 124586;
    }
}
