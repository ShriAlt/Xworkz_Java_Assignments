package com.xworkz.internal;

public class CarCameraDevice implements Car, Camera {
    public void startEngine() {}
    public void accelerate() {}
    public void brake() {}
    public void capture() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
    public void zoomIn() {}
    public void zoomOut() {}
}
