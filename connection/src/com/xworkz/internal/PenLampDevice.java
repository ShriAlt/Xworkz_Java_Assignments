package com.xworkz.internal;

public class PenLampDevice implements Pen, Lamp {
    public void write() {}
    public void draw() {}
    public void refill() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
    public void switchOn() {}
    public void switchOff() {}
    public void dimLight() {}
}
