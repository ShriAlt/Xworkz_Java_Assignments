package com.xworkz.internal;

public class TabletImpl implements Tablet {
    public void openApp() {}
    public void rotateScreen() {}
    public void lockDevice() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
}
