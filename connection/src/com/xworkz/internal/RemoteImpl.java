package com.xworkz.internal;

public class RemoteImpl implements Remote {
    public void pressButton() {}
    public void changeBattery() {}
    public void signalTV() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
}
