package com.xworkz.internal;

public class BottleBackpackDevice implements Bottle, Backpack {
    public void openCap() {}
    public void pourWater() {}
    public void closeCap() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
    public void zipOpen() {}
    public void storeItem() {}
    public void zipClose() {}
}
