package com.xworkz.internal;

public interface Mixer {
    void addIngredients();
    void startMixing();
    void stopMixing();
    default void rule(){}
}
