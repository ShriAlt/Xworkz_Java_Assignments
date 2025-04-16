package com.xworkz.internal;

public class Fridge implements CoolingDevice, KitchenItem {
    public void grow() {
        System.out.println("Fridge is growing");
    }

    public void move() {
        System.out.println("Fridge is moving");
    }

    public void function() {
        System.out.println("Fridge is functioning");
    }
}