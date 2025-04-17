package com.xworkz.internal;

public class PrinterRouterDevice implements Printer, Router {
    public void printDocument() {}
    public void scanDocument() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
    public void cancelJob() {}
    public void connectInternet() {}
    public void resetRouter() {}
    public void checkSignal() {}
}
