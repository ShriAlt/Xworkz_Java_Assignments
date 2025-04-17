package com.xworkz.internal;

public class FridgeImpl implements Fridge {
    public void openFridge() {}
    public void storeFood() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
    public void closeFridge() {}
}
