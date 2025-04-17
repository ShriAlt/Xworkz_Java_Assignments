package com.xworkz.internal;

public class PillowImpl implements Pillow {
    public void fluff() {}
    public void place() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
    public void removeCover() {}
}
