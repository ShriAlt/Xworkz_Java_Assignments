package com.xworkz.internal;

public class MopImpl implements Mop {
    public void dipInWater() {}
    public void mopFloor() {}
    public void rinse() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
}
