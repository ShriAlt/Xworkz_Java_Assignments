package com.xworkz.internal;

public class WatchTelevisionDevice implements Watch, Television {
    public void showTime() {}
    public void setAlarm() {}
    public void startTimer() {}
    public void switchChannel() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
    public void increaseVolume() {}
    public void powerOff() {}
}
