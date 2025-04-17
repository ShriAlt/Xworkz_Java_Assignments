package com.xworkz.internal;

public class BrushImpl implements Brush {
    public void brushTeeth() {}
    public void rinse() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
    public void store() {}
}
