package com.xworkz.internal;

public class BroomImpl implements Broom {
    public void sweep() {}
    public void shakeOff() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
    public void store() {}
}
