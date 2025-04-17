package com.xworkz.internal;

public class ShoeImpl implements Shoe {
    public void wear() {}
    public void tieLaces() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
    public void remove() {}
}
