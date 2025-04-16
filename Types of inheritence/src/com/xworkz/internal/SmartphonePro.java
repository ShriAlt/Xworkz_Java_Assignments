package com.xworkz.internal;

public class SmartphonePro implements PhoneFeature, CameraFeature {
    public void grow() {
        System.out.println("SmartphonePro is growing");
    }

    public void move() {
        System.out.println("SmartphonePro is moving");
    }

    public void function() {
        System.out.println("SmartphonePro is functioning");
    }
}