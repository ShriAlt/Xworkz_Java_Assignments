package com.xworkz.internal;

public class DeskChairDevice implements Desk, Chair {
    public void openDrawer() {}
    public void closeDrawer() {}
    public void adjustHeight() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
    public void sit() {}
    public void recline() {}
    public void roll() {}
}
