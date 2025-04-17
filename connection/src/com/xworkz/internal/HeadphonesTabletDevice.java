package com.xworkz.internal;

public class HeadphonesTabletDevice implements Headphones, Tablet {
    public void connectBluetooth() {}
    public void increaseVolume() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
    public void decreaseVolume() {}
    public void openApp() {}
    public void rotateScreen() {}
    public void lockDevice() {}
}
