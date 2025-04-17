package com.xworkz.internal;

public class JuicerImpl implements Juicer {
    public void insertFruit() {}
    public void extractJuice() {}
    public void cleanJuicer() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
}
