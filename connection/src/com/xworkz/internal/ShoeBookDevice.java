package com.xworkz.internal;

public class ShoeBookDevice implements Shoe, Book {
    public void wear() {}
    public void tieLaces() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
    public void remove() {}
    public void open() {}
    public void read() {}
    public void bookmarkPage() {}
}
