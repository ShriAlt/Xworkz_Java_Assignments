package com.xworkz.internal;

public class TelevisionImpl implements Television {
    public void switchChannel() {}
    public void increaseVolume() {}
    public void powerOff() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
}
