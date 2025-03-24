package com.xworks.monday;

public class Pinocchio {
    public String sword;
    int stat;
    private String location;
    public Pinocchio(String sword,int stat){
        this.stat=stat;
        this.sword=sword;
    }
    private void game(){
        location="Round table";
        System.out.println("private method :"+location);
    }
    public void lie(){
        System.out.println("state:"+stat);
        game();
    }
    void notLie(){
        System.out.println("default method :"+sword);
    }

}
