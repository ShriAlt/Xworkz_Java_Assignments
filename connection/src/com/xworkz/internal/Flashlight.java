package com.xworkz.internal;

public interface Flashlight {
    void switchOn();
    void switchOff();
    void replaceBattery();
    default void rule(){}
}
