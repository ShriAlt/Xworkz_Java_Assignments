package com.xworkz.internal;

public class Monitor extends ElectronicDevice{
    @Override
    public void powerOn() {
        System.out.println("Device is powered on.(Override)");
    }
    @Override
    public void powerOff() {
        System.out.println("Device is powered off.(Override)");
    }
    @Override
    public void batteryStatus() {
        System.out.println("Checking battery status...(Override)");
    }
    @Override
    public void connectToWiFi() {
        System.out.println("Connecting to WiFi...(Override)");
    }
    @Override
    public void softwareUpdate() {
        System.out.println("Checking for software updates...(Override)");
    }
}
