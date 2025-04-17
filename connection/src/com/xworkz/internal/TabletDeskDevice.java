package com.xworkz.internal;

public class TabletDeskDevice implements Tablet, Desk {
    public void openApp() {}
    public void rotateScreen() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
    public void lockDevice() {}
    public void openDrawer() {}
    public void closeDrawer() {}
    public void adjustHeight() {}
}
