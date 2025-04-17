package com.xworkz.internal;

public class ToasterImpl implements Toaster {
    public void insertBread() {}
    public void startToasting() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
    public void ejectToast() {}
}
