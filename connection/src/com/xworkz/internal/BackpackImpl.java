package com.xworkz.internal;

public class BackpackImpl implements Backpack {
    @Override
    public void zipOpen() {
        System.out.println("running method");
    }

    @Override
    public void storeItem() {
        System.out.println("running method");
    }

    @Override
    public void zipClose() {
        System.out.println("running method");
    }
}
