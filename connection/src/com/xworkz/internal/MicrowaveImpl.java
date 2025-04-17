package com.xworkz.internal;

public class MicrowaveImpl implements Microwave {
    public void startHeating() {}
    public void stopHeating() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
    public void setTimer() {}
}
