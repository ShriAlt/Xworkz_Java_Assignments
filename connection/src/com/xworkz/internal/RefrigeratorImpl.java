package com.xworkz.internal;

public class RefrigeratorImpl implements Refrigerator {
    public void coolItems() {}
    public void defrost() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
    public void setTemperature() {}
}
