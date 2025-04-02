package com.xworkz.internal;

public class Building {
    public void openDoors() {
        System.out.println(getClass().getSimpleName() + " doors are open.");
    }

    public void closeDoors() {
        System.out.println(getClass().getSimpleName() + " doors are closed.");
    }

    public void turnOnLights() {
        System.out.println(getClass().getSimpleName() + " lights are turned on.");
    }

    public void turnOffLights() {
        System.out.println(getClass().getSimpleName() + " lights are turned off.");
    }

    public void securityCheck() {
        System.out.println(getClass().getSimpleName() + " is performing a security check...");
    }
}
