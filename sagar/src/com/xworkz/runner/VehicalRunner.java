package com.xworkz.runner;

import com.xworkz.internal.*;

public class VehicalRunner {
    public static void main(String[] args) {
        Car car=new Car();
        car.move();
        car.capacity();
        car.fuelType();
        car.horn();
        car.stop();

        Bike bike=new Bike();
        bike.capacity();
        bike.horn();
        bike.move();
        bike.fuelType();
        bike.stop();

        Bus bus = new Bus();
        bus.move();
        bus.capacity();
        bus.fuelType();
        bus.horn();
        bus.stop();

        Train train = new Train();
        train.move();
        train.capacity();
        train.fuelType();
        train.horn();
        train.stop();

        Ship ship = new Ship();
        ship.move();
        ship.capacity();
        ship.fuelType();
        ship.horn();
        ship.stop();

        Helicopter helicopter = new Helicopter();
        helicopter.move();
        helicopter.capacity();
        helicopter.fuelType();
        helicopter.horn();
        helicopter.stop();

        Rocket rocket = new Rocket();
        rocket.move();
        rocket.capacity();
        rocket.fuelType();
        rocket.horn();
        rocket.stop();

        Tractor tractor = new Tractor();
        tractor.move();
        tractor.capacity();
        tractor.fuelType();
        tractor.horn();
        tractor.stop();

        Bicycle bicycle = new Bicycle();
        bicycle.move();
        bicycle.capacity();
        bicycle.fuelType();
        bicycle.horn();
        bicycle.stop();

        Truck truck = new Truck();
        truck.move();
        truck.capacity();
        truck.fuelType();
        truck.horn();
        truck.stop();
    }
}
