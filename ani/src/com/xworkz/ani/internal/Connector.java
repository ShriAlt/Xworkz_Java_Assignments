package com.xworkz.ani.internal;

public interface Connector {
   default void run(){
       System.out.println("running in interface");
   }
}
