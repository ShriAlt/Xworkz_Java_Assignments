package com.xworkz.internal;

public class DoorImpl implements Door {
    public void unlock() {}
    public void openDoor() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
    public void closeDoor() {}
}
