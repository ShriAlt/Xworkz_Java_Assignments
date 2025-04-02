package com.xworkz.internal;

public class Vehicle {
    public Vehicle(){
        System.out.println("no args const of vehicle");
    }
   public void move() {
        System.out.println("Vehicle is moving...");
    }

    public void stop() {
        System.out.println("Vehicle is stopping...");
    }

   public void fuelType() {
        System.out.println("Vehicle uses fuel.");
    }

   public void capacity() {
        System.out.println("Vehicle has a certain capacity.");
    }

    public void horn() {
        System.out.println("Vehicle honks...");
    }
}
