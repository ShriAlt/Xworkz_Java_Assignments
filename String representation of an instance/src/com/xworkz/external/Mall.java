package com.xworkz.external;

import com.xworkz.internal.Building;

public class Mall extends Building {
    private String name;
    private int noOfRooms;
    private String location;
    public Mall(String name,int noOfRooms,String location){
        this.name=name;
        this.location=location;
        this.noOfRooms=noOfRooms;
    }

    @Override
    public String toString() {
        return "Mall{" +
                "name='" + name + '\'' +
                ", noOfRooms=" + noOfRooms +
                ", location='" + location + '\'' +
                '}';
    }
}
