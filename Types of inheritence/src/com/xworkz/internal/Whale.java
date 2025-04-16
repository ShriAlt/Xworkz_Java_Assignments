package com.xworkz.internal;

public class Whale implements Mammal, AquaticAnimal {
    public void grow() {
        System.out.println("Whale is growing");
    }

    public void move() {
        System.out.println("Whale is moving");
    }

    public void function() {
        System.out.println("Whale is functioning");
    }
}