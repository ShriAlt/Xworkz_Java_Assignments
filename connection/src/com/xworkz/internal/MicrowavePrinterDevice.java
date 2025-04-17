package com.xworkz.internal;

public class MicrowavePrinterDevice implements Microwave, Printer {
    public void startHeating() {}
    public void stopHeating() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
    public void setTimer() {}
    public void printDocument() {}
    public void scanDocument() {}
    public void cancelJob() {}
}
