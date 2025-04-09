package com.xworkz.external;

import com.xworkz.internal.Plant;

public class Bush extends Plant {
    private String name;
    private String type;
    private String location;
    public Bush(String name,String type,String location){
        this.name=name;
        this.type=type;
        this.location=location;
    }

    @Override
    public String toString() {
        return "Bush{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
