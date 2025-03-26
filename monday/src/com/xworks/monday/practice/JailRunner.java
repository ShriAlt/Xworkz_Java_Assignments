package com.xworks.monday.practice;

public class JailRunner {
    public static void main(String[] args) {
        System.out.println("running jail");
        Jail jail=new Jail();

        System.out.println(jail.getName());
        jail.setName("harsha");
        System.out.println(jail.getName());
        jail.setName("habu");
        System.out.println(jail.getName());
    }
}
