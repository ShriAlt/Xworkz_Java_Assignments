package com.xworkz.internal;

public class MattressImpl implements Mattress {
    public void rollOut() {}
    public void layOn() {}
    public void store() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
}
