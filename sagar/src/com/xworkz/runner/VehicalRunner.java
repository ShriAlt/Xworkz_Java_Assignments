package com.xworkz.runner;

import com.xworkz.internal.Car;
import sun.misc.Cache;

public class VehicalRunner {
    public static void main(String[] args) {
        Car car=new Car();
        car.move();
        car.capacity();
        car.fuelType();
        car.horn();
        car.stop();
    }
}
