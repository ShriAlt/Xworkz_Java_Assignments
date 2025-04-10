package com.xworkz.external;

import com.xworkz.internal.Brand;

public class AirJordan extends Brand {
    private String branName;
    private int ratings;
    private int value;

    public AirJordan(String branName,int ratings,int value){

        this.branName=branName;
        this.ratings=ratings;
        this.value=value;
    }

    @Override
    public String toString() {
        return "AirJordan{" +
                "branName='" + branName + '\'' +
                ", ratings=" + ratings +
                ", value=" + value +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 100;
    }
}
