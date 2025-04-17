package com.xworkz.internal;

public class DrillImpl implements Drill {
    public void startDrill() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
    public void stopDrill() {}
    public void changeBit() {}
}
