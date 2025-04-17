package com.xworkz.internal;

public class PhoneImpl implements Phone {
    public void makeCall() {}
    public void sendText() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
    public void takePhoto() {}
}
