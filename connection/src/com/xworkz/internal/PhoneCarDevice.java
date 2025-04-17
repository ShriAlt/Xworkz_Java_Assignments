package com.xworkz.internal;

public class PhoneCarDevice implements Phone, Car {
    public void makeCall() {}
    public void sendText() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
    public void takePhoto() {}
    public void startEngine() {}
    public void accelerate() {}
    public void brake() {}
}
