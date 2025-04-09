package com.xworkz.external;

import com.xworkz.internal.Building;

public class Factory extends Building {
    private String name;
    private int noOfRooms;
    private String location;
    public Factory(String name,int noOfRooms,String location){
        this.name=name;
        this.location=location;
        this.noOfRooms=noOfRooms;
    }

    @Override
    public String toString() {
        return "Factory{" +
                "name='" + name + '\'' +
                ", noOfRooms=" + noOfRooms +
                ", location='" + location + '\'' +
                '}';
    }
}
