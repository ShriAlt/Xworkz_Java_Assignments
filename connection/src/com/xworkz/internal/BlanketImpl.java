package com.xworkz.internal;

public class BlanketImpl implements Blanket {
    public void coverUp() {}
    public void fold() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
    public void store() {}
}
