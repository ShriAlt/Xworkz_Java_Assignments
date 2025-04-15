package com.xworkz.runner;

import com.xworkz.internal.Car;
import com.xworkz.internal.Dove;
import com.xworkz.internal.DuffleBag;
import com.xworkz.internal.PlasticBottle;

public class MainRunner {
    public static void main(String[] args) {
        Car car=new Car();
        PlasticBottle plasticBottle=new PlasticBottle();
        Dove dove=new Dove();
        dove.displayShampoo();
        dove.apply();
        DuffleBag duffleBag=new DuffleBag();
        duffleBag.bagDisplay();
    }
}
