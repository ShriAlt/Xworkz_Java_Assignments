package com.xworkz.internal;

public class KnifeImpl implements Knife {
    public void cut() {}
    public void slice() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
    public void wash() {}
}
