package com.xworkz.internal;

public class Museum extends Building{
    @Override
    public void openDoors() {
        System.out.println(getClass().getSimpleName() + " doors are open (overriding)");
    }
    @Override
    public void closeDoors() {
        System.out.println(getClass().getSimpleName() + " doors are closed (overriding)");
    }
    @Override
    public void turnOnLights() {
        System.out.println(getClass().getSimpleName() + " lights are turned on (overriding)");
    }
    @Override
    public void turnOffLights() {
        System.out.println(getClass().getSimpleName() + " lights are turned off (overriding)");
    }
    @Override
    public void securityCheck() {
        System.out.println(getClass().getSimpleName() + " is performing a security check...(overriding)");
    }
}
