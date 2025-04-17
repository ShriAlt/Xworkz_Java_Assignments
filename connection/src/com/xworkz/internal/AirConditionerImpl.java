package com.xworkz.internal;

public class AirConditionerImpl implements AirConditioner {

    @Override
    public void turnOn() {

    }

    @Override
    public void adjustTemp() {

    }

    @Override
    public void turnOff() {

    }

    @Override
    public void adjust() {
//        AirConditioner.super.adjust();
        System.out.println("running the default methods");
    }
}
