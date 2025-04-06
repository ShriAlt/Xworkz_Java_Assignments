package com.xworkz.internal;

public class Chisel extends Tool{
    @Override
    public void use() {
        System.out.println("Using the tool.(overriden)");
    }
    @Override
    public void repair() {
        System.out.println("Repairing the tool.(overriden)");
    }
    @Override
    public void maintain() {
        System.out.println("Maintaining the tool.(overriden)");
    }
    @Override
    public void store() {
        System.out.println("Storing the tool safely.(overriden)");
    }
    @Override
    public void checkCondition() {
        System.out.println("Checking the tool's condition.(overriden)");
    }
}
