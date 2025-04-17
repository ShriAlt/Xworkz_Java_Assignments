package com.xworkz.internal;

public class BlenderImpl implements Blender {
    public void blend() {}
    public void stop() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
    public void clean() {}
}
