package com.xworkz.internal;

public class BicycleImpl implements Bicycle {
    public void pedal() {}
    public void brake() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
    public void ringBell() {}
}
