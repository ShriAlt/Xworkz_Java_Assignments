package com.xworkz.internal;

public class FanOvenDevice implements Fan, Oven {
    public void turnOn() {}
    public void turnOff() {}
    public void changeSpeed() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
    public void preheat() {}
    public void bake() {}
    public void shutDown() {}
}
