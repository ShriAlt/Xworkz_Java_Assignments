package com.xworkz.internal;

public class SmartTV implements Display, InputDevice {
    public void grow() {
        System.out.println("SmartTV is growing");
    }

    public void move() {
        System.out.println("SmartTV is moving");
    }

    public void function() {
        System.out.println("SmartTV is functioning");
    }
}