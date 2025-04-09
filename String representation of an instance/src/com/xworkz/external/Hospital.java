package com.xworkz.external;

import com.xworkz.internal.Building;

public class Hospital extends Building {
    private String name;
    private int noOfRooms;
    private String location;
    public Hospital(String name,int noOfRooms,String location){
        this.name=name;
        this.location=location;
        this.noOfRooms=noOfRooms;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "name='" + name + '\'' +
                ", noOfRooms=" + noOfRooms +
                ", location='" + location + '\'' +
                '}';
    }
}
