package com.xworkz.internal;

public class SpoonImpl implements Spoon {
    public void scoop() {}
    public void eat() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
    public void wash() {}
}
