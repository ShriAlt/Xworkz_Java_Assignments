package com.xworkz.internal;

public class LampMugDevice implements Lamp, Mug {
    public void switchOn() {}
    public void switchOff() {}
    public void dimLight() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
    public void fill() {}
    public void sip() {}
    public void clean() {}
}
