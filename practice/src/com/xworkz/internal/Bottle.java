package com.xworkz.internal;

public class Bottle extends Bag {
    protected void display(){
        super.displayBag();
        this.displayBag();

    }

//    @Override    //can not override the final methods
//    public void  displayBag() {
//        System.out.println("overridden method");
//    }
}
