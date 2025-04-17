package com.xworkz.internal;

public class BowlImpl implements Bowl {
    public void fillSoup() {}
    public void eat() {}
    public void cleanBowl() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
}
