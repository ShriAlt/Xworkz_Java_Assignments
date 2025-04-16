package com.xworkz.internal;

public class HybridEngine implements Engine, Motor {
    public void grow() {
        System.out.println("HybridEngine is growing");
    }

    public void move() {
        System.out.println("HybridEngine is moving");
    }

    public void function() {
        System.out.println("HybridEngine is functioning");
    }
}