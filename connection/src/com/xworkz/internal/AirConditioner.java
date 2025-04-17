package com.xworkz.internal;

public interface AirConditioner {
    void turnOn();
    void adjustTemp();
    void turnOff();
    default void adjust(){

    }
}
