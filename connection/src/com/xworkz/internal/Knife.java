package com.xworkz.internal;

public interface Knife {
    void cut();
    void slice();
    void wash();
    default void rule(){}
}
