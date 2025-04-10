package com.xworkz.external;

import com.xworkz.internal.Plant;

public class Fern extends Plant {
    private String name;
    private String type;
    private String location;
    public Fern(String name,String type,String location){
        this.name=name;
        this.type=type;
        this.location=location;
    }

    @Override
    public String toString() {
        return "Fern{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 74185;
    }
}
