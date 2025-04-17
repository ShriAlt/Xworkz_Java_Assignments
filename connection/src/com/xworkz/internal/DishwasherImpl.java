package com.xworkz.internal;

public class DishwasherImpl implements Dishwasher {
    public void loadDishes() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
    public void startWash() {}
    public void dryDishes() {}
}
