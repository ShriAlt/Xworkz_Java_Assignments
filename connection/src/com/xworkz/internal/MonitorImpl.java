package com.xworkz.internal;

public class MonitorImpl implements Monitor {
    public void turnOn() {}
    public void adjustBrightness() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
    public void turnOff() {}
}
