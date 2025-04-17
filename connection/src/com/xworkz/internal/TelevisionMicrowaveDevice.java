package com.xworkz.internal;

public class TelevisionMicrowaveDevice implements Television, Microwave {
    public void switchChannel() {}
    public void increaseVolume() {}
    public void powerOff() {}
    public void startHeating() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
    public void stopHeating() {}
    public void setTimer() {}
}
