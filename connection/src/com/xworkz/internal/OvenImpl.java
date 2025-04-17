package com.xworkz.internal;

public class OvenImpl implements Oven {
    public void preheat() {}
    public void bake() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
    public void shutDown() {}
}
