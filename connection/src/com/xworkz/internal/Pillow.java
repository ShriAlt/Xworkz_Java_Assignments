package com.xworkz.internal;

public interface Pillow {
    void fluff();
    void place();
    default void rule(){}
    void removeCover();
}
