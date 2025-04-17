package com.xworkz.internal;

public class ScooterImpl implements Scooter {
    public void kickStart() {}
    public void ride() {}
    public void park() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
}
