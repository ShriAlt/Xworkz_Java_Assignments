package com.xworkz.internal;

public class TowelImpl implements Towel {
    public void wipe() {}
    public void dry() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
    public void fold() {}
}
