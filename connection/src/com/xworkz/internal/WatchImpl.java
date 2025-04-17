package com.xworkz.internal;

public class WatchImpl implements Watch {
    public void showTime() {}
    public void setAlarm() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
    public void startTimer() {}
}
