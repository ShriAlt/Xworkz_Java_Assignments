package com.xworkz.collection.runner;

import com.xworkz.collection.external.Bike;

import java.util.ArrayList;
import java.util.Collection;

public class MainRunner {
    public static void main(String[] args) {

                Collection<String> bike = new ArrayList<>();
                bike.add("Yamaha");
                bike.add("Honda");
                bike.add("Suzuki");
                bike.add("KTM");
                bike.add("Royal Enfield");
                bike.add("BMW");
                bike.add("Harley");
                bike.add("TVS");
                bike.add("Ducati");
                bike.add("Bajaj");

                System.out.println("Bike size after first add: " + bike.size());
                bike.clear();

                bike.add("Activa");
                bike.add("Vespa");
                bike.add("Pulsar");
                bike.add("Apache");

                bike.add("FZ");
                bike.add("R15");

                System.out.println("Bike size after re-adding: " + bike.size());

                Collection<String> car = new ArrayList<>();
                car.add("Toyota");
                car.add("Honda");
                car.add("Suzuki");
                car.add("Hyundai");
                car.add("Ford");
                car.add("Kia");
                car.add("Tata");
                car.add("Mahindra");
                car.add("Nissan");
                car.add("BMW");

                System.out.println("Car size after first add: " + car.size());
                car.clear();

                car.add("Audi");
                car.add("Mercedes");
                car.add("Skoda");
                car.add("Volkswagen");
                car.add("Lexus");

                car.add("Volvo");

                System.out.println("Car size after re-adding: " + car.size());

                Collection<String> bag = new ArrayList<>();
                bag.add("Skybags");
                bag.add("American Tourister");
                bag.add("Wildcraft");
                bag.add("Nike");
                bag.add("Adidas");
                bag.add("F Gear");
                bag.add("Safari");
                bag.add("Puma");
                bag.add("Tommy");
                bag.add("Zara");

                System.out.println("Bag size after first add: " + bag.size());
                bag.clear();
        System.out.println("Bag size after clear add: " + bag.size());
                bag.add("Reebok");
                bag.add("HRX");
                bag.add("VIP");
                bag.add("Aristocrat");
                bag.add("Wenger");

                bag.add("Lavie");
                bag.add("Baggit");

                System.out.println("Bag size after re-adding: " + bag.size());

                Collection<String> pen = new ArrayList<>();
                pen.add("Reynolds");
                pen.add("Cello");
                pen.add("Pilot");
                pen.add("Parker");
                pen.add("Flair");
                pen.add("Linc");
                pen.add("Uniball");
                pen.add("Classmate");
                pen.add("Pentonic");
                pen.add("Add Gel");

                System.out.println("Pen size after first add: " + pen.size());
                pen.clear();

                pen.add("Trimax");
                pen.add("Lexi");
                pen.add("Snowman");
                pen.add("Hauser");
                pen.add("Montblanc");

                pen.add("Nataraj");
                pen.add("Faber-Castell");
                pen.add("Pilot V5");

                System.out.println("Pen size after re-adding: " + pen.size());

                Collection<String> watch = new ArrayList<>();
                watch.add("Titan");
                watch.add("Fastrack");
                watch.add("Casio");
                watch.add("Rolex");
                watch.add("Timex");
                watch.add("Apple");
                watch.add("Samsung");
                watch.add("Fire-Boltt");
                watch.add("Noise");
                watch.add("BoAt");

                System.out.println("Watch size after first add: " + watch.size());
                watch.clear();

                watch.add("Daniel Wellington");
                watch.add("G-Shock");
                watch.add("Fossil");
                watch.add("Sonata");

                watch.add("Diesel");
                watch.add("Guess");
                watch.add("Armani");

                System.out.println("Watch size after re-adding: " + watch.size());
        Bike bike1=new Bike();
        bike1.run();
            }
        }
