package com.xworkz.internal;

public class Bag extends Bottle {
    protected Bag(){
        System.out.println("no args const of bag");
        Bottle bottle=new Bottle();
        bottle.display();
    }
    public final void displayBag(){
        System.out.println("running bag ....");
    }
}
