package com.xworkz.internal;

public class OvenLaptopDevice implements Oven, Laptop {
    public void preheat() {}
    public void bake() {}
    public void shutDown() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
    public void powerOn() {}
    public void runProgram() {}
    public void sleepMode() {}
}
