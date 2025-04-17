package com.xworkz.internal;

public class WashingMachineImpl implements WashingMachine {
    public void startCycle() {}
    public void stopCycle() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
    public void drainWater() {}
}
