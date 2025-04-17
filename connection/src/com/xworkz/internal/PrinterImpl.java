package com.xworkz.internal;

public class PrinterImpl implements Printer {
    public void printDocument() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
    public void scanDocument() {}
    public void cancelJob() {}
}
