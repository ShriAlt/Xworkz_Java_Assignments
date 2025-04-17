package com.xworkz.internal;

public class CameraWatchDevice implements Camera, Watch {
    public void capture() {}
    public void zoomIn() {}
    public void zoomOut() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
    public void showTime() {}
    public void setAlarm() {}
    public void startTimer() {}
}
