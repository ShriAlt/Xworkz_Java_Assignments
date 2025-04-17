package com.xworkz.internal;

public interface Helmet {
    void wear();
    void adjustStrap();
    void remove();
    default void rule(){}
}
