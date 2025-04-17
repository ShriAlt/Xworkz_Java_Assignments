package com.xworkz.internal;

public class BookImpl implements Book {
    public void open() {}
    public void read() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
    public void bookmarkPage() {}
}
