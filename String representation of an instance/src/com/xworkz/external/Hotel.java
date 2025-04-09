package com.xworkz.external;

import com.xworkz.internal.Building;

public class Hotel extends Building {
    private String name;
    private int noOfRooms;
    private String location;
    public Hotel(String name,int noOfRooms,String location){
        this.name=name;
        this.location=location;
        this.noOfRooms=noOfRooms;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", noOfRooms=" + noOfRooms +
                ", location='" + location + '\'' +
                '}';
    }
}
