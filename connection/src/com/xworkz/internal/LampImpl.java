package com.xworkz.internal;

public class LampImpl implements Lamp {
    public void switchOn() {}
    public void switchOff() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
    public void dimLight() {}
}
