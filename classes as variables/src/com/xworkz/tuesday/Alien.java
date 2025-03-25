package com.xworkz.tuesday;

public class Alien {
    //Alien: seenby,seenDate,describe
    private String seenBy;
    private int seenDate;
    private String describe;
    public Alien(){
        System.out.println("no args const of Alien");
    }

    public String getSeenBy(){
        return this.seenBy;
    }

    public int getSeenDate() {
        return seenDate;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public void setSeenBy(String seenBy) {
        this.seenBy = seenBy;
    }

    public void setSeenDate(int seenDate) {
        this.seenDate = seenDate;
    }
    public void seeAlien(Camera camera){
        System.out.println("running seealien in alien");
        if(camera!=null){
            camera.setBrand("nikon");
            camera.setPrice(60000);
            camera.setConnectivity("bluetooth");
            camera.setType(CameraType.GOPRO);
            System.out.println("brand:"+camera.getBrand());
            System.out.println(camera.getConnectivity());
            System.out.println(camera.getPrice());
            System.out.println(camera.getType());
        }
    }
}
