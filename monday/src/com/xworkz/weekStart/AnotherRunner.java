package com.xworkz.weekStart;

import com.xworks.monday.Pinocchio;

public class AnotherRunner {
    public static void main(String[] args) {
        Pinocchio pinocchio=new Pinocchio("blade",87);
        pinocchio.lie();
        String sword=pinocchio.sword;
        System.out.println(sword);
    }
}
