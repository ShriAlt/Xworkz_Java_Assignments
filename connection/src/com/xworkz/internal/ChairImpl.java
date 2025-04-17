package com.xworkz.internal;

public class ChairImpl implements Chair {
    public void sit() {}
    public void recline() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
    public void roll() {}
}
