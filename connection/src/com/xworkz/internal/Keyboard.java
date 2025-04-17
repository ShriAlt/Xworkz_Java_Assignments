package com.xworkz.internal;

public interface Keyboard {
    void type();
    void connect();
    default void rule(){}
    void disconnect();
}
