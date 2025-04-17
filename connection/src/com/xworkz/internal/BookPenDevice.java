package com.xworkz.internal;

public class BookPenDevice implements Book, Pen {
    public void open() {}
    public void read() {}
    public void bookmarkPage() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
    public void write() {}
    public void draw() {}
    public void refill() {}
}
