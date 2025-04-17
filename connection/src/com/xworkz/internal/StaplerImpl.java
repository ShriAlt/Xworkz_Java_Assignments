package com.xworkz.internal;

public class StaplerImpl implements Stapler {
    public void insertStaple() {}
    public void staplePaper() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
    public void refillStaples() {}
}
