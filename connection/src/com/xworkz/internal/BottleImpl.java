package com.xworkz.internal;

public class BottleImpl implements Bottle {
    public void openCap() {}
    public void pourWater() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
    public void closeCap() {}
}
