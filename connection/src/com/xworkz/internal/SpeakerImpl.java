package com.xworkz.internal;

public class SpeakerImpl implements Speaker {
    public void playMusic() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
    public void pauseMusic() {}
    public void adjustVolume() {}
}
