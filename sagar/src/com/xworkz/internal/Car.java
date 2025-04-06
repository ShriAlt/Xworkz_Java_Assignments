package com.xworkz.internal;

public class Car extends Vehicle{
    public Car(){
        super();
        System.out.println("no args off Car");
    }
    @Override
    public void move() {
        System.out.println("Vehicle is moving...(Override)");
    }
    @Override
    public void stop() {
        System.out.println("Vehicle is stopping...(Override)");
    }
    @Override
    public void fuelType() {
        System.out.println("Vehicle uses fuel (Override)");
    }
    @Override
    public void capacity() {
        System.out.println("Vehicle has a certain capacity (Override)");
    }
    @Override
    public void horn() {
        System.out.println("Vehicle honks...(Override)");
    }

}
