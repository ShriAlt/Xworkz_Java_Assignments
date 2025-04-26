package com.xworkz.java;

public class Harsha {

    public void count(){
        int[] nums={ 10,25,30,75,50,20,100,70,60};
//        int num=10;
        int result=0;
        for (int n :nums){

                if ( n>=70 && n <=100){
                    result ++;
                }
//            else System.out.println("no numbers");;;;

        }

        System.out.println(result);
    }
}
