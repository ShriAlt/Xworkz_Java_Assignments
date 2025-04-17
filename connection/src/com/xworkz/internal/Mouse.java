package com.xworkz.internal;

public interface Mouse {
    void click();
    void scroll();
    void move();
    default void rule(){}
}
