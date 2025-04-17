package com.xworkz.internal;

public class WindowImpl implements Window {
    public void openWindow() {}
    public void closeWindow() {}
    public void lockWindow() {}

    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
}
