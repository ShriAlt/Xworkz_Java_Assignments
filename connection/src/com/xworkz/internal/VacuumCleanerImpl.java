package com.xworkz.internal;

public class VacuumCleanerImpl implements VacuumCleaner {
    public void startCleaning() {}
    public void pauseCleaning() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
    public void emptyBin() {}
}
