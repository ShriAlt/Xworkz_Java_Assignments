package com.xworkz.internal;

public class Tree extends Plant{
    public Tree(){
        System.out.println("no args const of tree");
    }
    @Override
    public void grow() {
        System.out.println("The plant is growing.(overridding)");
    }

    @Override
    public void photosynthesize() {
        System.out.println("The plant is performing photosynthesis.(overridding)");
    }

    @Override
    public void absorbWater() {
        System.out.println("The plant is absorbing water.(overridding)");
    }

    @Override
    public void reproduce() {
        System.out.println("The plant is reproducing.(overridding)");
    }

    @Override
    public void provideOxygen() {
        System.out.println("The plant is releasing oxygen.(overridding)");


    }
}
