package com.xworkz.tuesday;

public class Camera {
    //Camera: brand,price,type(enum),connectivity
    private String brand;
    private int price;
    private CameraType type;
    private String connectivity;

    public CameraType getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public String getConnectivity() {
        return connectivity;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setConnectivity(String connectivity) {
        this.connectivity = connectivity;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setType(CameraType type) {
        this.type = type;
    }
    public void showCamera(Alien alien){
        System.out.println("running in Camera");
        if (alien!=null){
            alien.setDescribe("funny looking");
            alien.setSeenBy("female");
            alien.setSeenDate(3);
            System.out.println( alien.getDescribe());
            System.out.println(alien.getSeenBy());
            System.out.println(alien.getSeenDate());
        }else System.err.println("can not be null");
        System.out.println("===============================================");
        Satellite satellite=new Satellite();
        satellite.setCost(78);
        satellite.setLoadCapacity(78);
        satellite.setType(Type.R1);
        satellite.setWeight(6700);
        System.out.println(satellite.getCost());
        System.out.println(satellite.getLoadCapacity());
        System.out.println(satellite.getType());
        System.out.println(satellite.getWeight());
    }
}
