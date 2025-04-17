package com.xworkz.internal;

public class CarImpl implements Car {
    public void startEngine() {}
    public void accelerate() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
    public void brake() {}
}
