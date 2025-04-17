package com.xworkz.internal;

public class FanImpl implements Fan {
    public void turnOn() {}
    public void turnOff() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
    public void changeSpeed() {}
}
