package com.xworkz.internal;

public interface Mattress {
    void rollOut();
    void layOn();
    void store();
    default void rule(){}
}
