package com.xworkz.internal;

public interface Fan {
    void turnOn();
    void turnOff();
    default void rule(){}
    void changeSpeed();
}
