package com.xworkz.internal;

public class ForkImpl implements Fork {
    public void stabFood() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
    public void eat() {}
    public void cleanFork() {}
}
