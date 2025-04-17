package com.xworkz.internal;

public class WhiteboardImpl implements Whiteboard {
    public void writeText() {}
    public void eraseText() {}
    public void cleanBoard() {}
    @Override
    public void rule() {
        System.out.println("runing the default methods");
    }
}
