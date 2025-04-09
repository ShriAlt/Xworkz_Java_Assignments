package com.xworkz.external;

import com.xworkz.internal.Plant;

public class Hearb extends Plant {
    private String name;
    private String type;
    private String location;
    public Hearb(String name,String type,String location){
        this.name=name;
        this.type=type;
        this.location=location;
    }

    @Override
    public String toString() {
        return "Hearb{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
