package com.xworkz.internal;

public class MugImpl implements Mug {
    public void fill() {}
    public void sip() {}
    public void clean() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
}
