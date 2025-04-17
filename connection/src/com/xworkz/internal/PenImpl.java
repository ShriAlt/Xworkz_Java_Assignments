package com.xworkz.internal;

public class PenImpl implements Pen {
    public void write() {}
    public void draw() {}
    public void refill() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
}
