package com.xworkz.internal;

public interface Clock {
    void setTime();
    void alarmRing();
    void showTime();
    default void rule(){}
}
