package com.xworkz.internal;

public class SpeakerProjectorDevice implements Speaker, Projector {
    public void playMusic() {}
    public void pauseMusic() {}
    public void adjustVolume() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
    public void projectImage() {}
    public void adjustFocus() {}
    public void powerDown() {}
}
