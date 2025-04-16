package com.xworkz.internal;

public class Dog implements Animal, Pet {
    public void grow() {
        System.out.println("Dog is growing");
    }

    public void move() {
        System.out.println("Dog is moving");
    }

    public void function() {
        System.out.println("Dog is functioning");
    }
}