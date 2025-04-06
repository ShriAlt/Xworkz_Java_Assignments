package com.xworkz.internal;

public class Cake extends Food{
    @Override
    public void taste() {
        System.out.println("Food has different tastes.(Override)");
    }
    @Override
    public void cook() {
        System.out.println("Food is being cooked...(Override)");
    }
    @Override
    public void serve() {
        System.out.println("Food is being served...(Override)");
    }
    @Override
    public void ingredients() {
        System.out.println("Food has different ingredients.(Override)");
    }
    @Override
    public void calories() {
        System.out.println("Checking calorie count...(Override)");
    }
}
