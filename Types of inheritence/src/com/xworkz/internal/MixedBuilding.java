package com.xworkz.internal;

public class MixedBuilding implements Residential, Commercial {
    public void grow() {
        System.out.println("MixedBuilding is growing");
    }

    public void move() {
        System.out.println("MixedBuilding is moving");
    }

    public void function() {
        System.out.println("MixedBuilding is functioning");
    }
}