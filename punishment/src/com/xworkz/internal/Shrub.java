package com.xworkz.internal;

public class Shrub extends Plant{
    public Shrub(){
        System.out.println("no args const");
    }
    @Override
    public void grow() {
        System.out.println("The plant is growing.");
    }

    @Override
    public void photosynthesize() {
        System.out.println("The plant is performing photosynthesis.");
    }

    @Override
    public void absorbWater() {
        System.out.println("The plant is absorbing water.");
    }

    @Override
    public void reproduce() {
        System.out.println("The plant is reproducing.");
    }

    @Override
    public void provideOxygen() {
        System.out.println("The plant is releasing oxygen.");


    }
}
