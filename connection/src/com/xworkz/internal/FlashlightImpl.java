package com.xworkz.internal;

public class FlashlightImpl implements Flashlight {
    public void switchOn() {}
    public void switchOff() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
    public void replaceBattery() {}
}
