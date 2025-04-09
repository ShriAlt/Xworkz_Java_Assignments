package com.xworkz.external;

import com.xworkz.internal.Brand;

public class Puma extends Brand {
    private String branName;
    private int ratings;
    private int value;

    public Puma(String branName,int ratings,int value){

        this.branName=branName;
        this.ratings=ratings;
        this.value=value;
    }

    @Override
    public String toString() {
        return "Puma{" +
                "branName='" + branName + '\'' +
                ", ratings=" + ratings +
                ", value=" + value +
                '}';
    }
}
