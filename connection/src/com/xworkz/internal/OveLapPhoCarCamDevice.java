package com.xworkz.internal;

public class OveLapPhoCarCamDevice implements Oven, Laptop, Phone, Car, Camera {
    public void preheat() {}
    public void bake() {}
    public void shutDown() {}
    public void powerOn() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
    public void runProgram() {}
    public void sleepMode() {}
    public void makeCall() {}
    public void sendText() {}
    public void takePhoto() {}
    public void startEngine() {}
    public void accelerate() {}
    public void brake() {}
    public void capture() {}
    public void zoomIn() {}
    public void zoomOut() {}
}
