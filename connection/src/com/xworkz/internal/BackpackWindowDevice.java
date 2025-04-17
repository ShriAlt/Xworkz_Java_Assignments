package com.xworkz.internal;

public class BackpackWindowDevice implements Backpack, Window {
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
    @Override
    public void openWindow() {
        System.out.println("running method");
    }
    @Override
    public void closeWindow() {
        System.out.println("running method");
    }
    @Override
    public void lockWindow() {
        System.out.println("running method");
    }
}
