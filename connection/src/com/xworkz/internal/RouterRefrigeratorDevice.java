package com.xworkz.internal;

public class RouterRefrigeratorDevice implements Router, Refrigerator {
    public void connectInternet() {}
    public void resetRouter() {}
    public void checkSignal() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
    public void coolItems() {}
    public void defrost() {}
    public void setTemperature() {}
}
