package com.xworkz.internal;

public class Truck implements LandVehicle, Transport {
    public void grow() {
        System.out.println("Truck is growing");
    }

    public void move() {
        System.out.println("Truck is moving");
    }

    public void function() {
        System.out.println("Truck is functioning");
    }
}