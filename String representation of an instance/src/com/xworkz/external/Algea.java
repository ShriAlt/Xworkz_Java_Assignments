package com.xworkz.external;

import com.xworkz.internal.Plant;

public class Algea extends Plant {
    private String name;
    private String type;
    private String location;
    public Algea(String name,String type,String location){
        this.name=name;
        this.type=type;
        this.location=location;
    }

    @Override
    public String toString() {
        return "Algea{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 98;
    }
}
