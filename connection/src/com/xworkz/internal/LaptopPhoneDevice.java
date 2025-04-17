package com.xworkz.internal;

public class LaptopPhoneDevice implements Laptop, Phone {
    public void powerOn() {}
    public void runProgram() {}
    public void sleepMode() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
    public void makeCall() {}
    public void sendText() {}
    public void takePhoto() {}
}
