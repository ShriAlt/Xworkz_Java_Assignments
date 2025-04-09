package com.xworkz.external;

import com.xworkz.internal.Animal;

public class Cow extends Animal {
    private String name;
    private String weight;
    private String color;
    public Cow(String name,String weight,String color){
        this.name=name;
        this.color=color;
        this.weight=weight;
    }

    @Override
    public String toString() {
        return "Cow{" +
                "name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
