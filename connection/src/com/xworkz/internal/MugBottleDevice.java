package com.xworkz.internal;

public class MugBottleDevice implements Mug, Bottle {
    public void fill() {}
    public void sip() {}
    public void clean() {}
    public void openCap() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
    public void pourWater() {}
    public void closeCap() {}
}
