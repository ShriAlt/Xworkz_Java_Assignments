package com.xworkz.internal;

public interface Book {
    void open();
    void read();
    void bookmarkPage();
    default void rule(){}
}
