package com.xworkz.internal;

public class ProjectorHeadphonesDevice implements Projector, Headphones {
    public void projectImage() {}
    public void adjustFocus() {}
    public void powerDown() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
    public void connectBluetooth() {}
    public void increaseVolume() {}
    public void decreaseVolume() {}
}
