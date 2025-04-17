package com.xworkz.internal;

public class ChairShoeDevice implements Chair, Shoe {
    public void sit() {}
    public void recline() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
    public void roll() {}
    public void wear() {}
    public void tieLaces() {}
    public void remove() {}
}
