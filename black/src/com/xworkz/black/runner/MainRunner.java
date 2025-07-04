package com.xworkz.black.runner;

import com.xworkz.black.external.Bottle;
import com.xworkz.black.external.Water;

public class MainRunner {
    public static void main(String[] args) {
        Water water=new Water();
        water.fill(( n)->(n>3));
    }
}
