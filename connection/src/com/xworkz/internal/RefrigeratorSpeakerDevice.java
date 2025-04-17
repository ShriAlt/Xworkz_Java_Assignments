package com.xworkz.internal;

public class RefrigeratorSpeakerDevice implements Refrigerator, Speaker {
    public void coolItems() {}
    public void defrost() {}
    public void setTemperature() {}
    public void playMusic() {}
    public void pauseMusic() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
    public void adjustVolume() {}
}
