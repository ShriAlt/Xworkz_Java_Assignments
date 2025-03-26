package com.xworkz.tuesday;

public class Satellite {
    //Satellite : type(enum),cost,weight,loadCapacity
    private Type type;
    private double cost;
    private double weight;
    private double loadCapacity;

    public Type getType(){
        return this.type;
    }
    public double getCost(){
        return this.cost;
    }
    public double getWeight(){
        return this.weight;
    }
    public double getLoadCapacity(){
        return this.loadCapacity;
    }
    public void setType(Type type){
        this.type=type;
    }
    public void setCost(double cost){
        this.cost=cost;
    }
    public void setWeight(double weight){
        this.weight=weight;
    }
    public void setLoadCapacity(double loadCapacity){
        this.loadCapacity=loadCapacity;
    }

    public void showSatellite(){
        System.out.println("running in satellite");
        //local veriable
        IdCard idCard1=new IdCard();
        Color color=new Color();
        idCard1.setDesignedBy("harsha");
        idCard1.setMaterial("plastic");
        idCard1.setWeight(89);

        IdCard idCard2=new IdCard();
        idCard2.setWeight(99);
        idCard2.setMaterial("not plastic");
        idCard2.setDesignedBy("ananya");

        IdCard[] idCards={idCard1,idCard2};
        for (IdCard idCard:idCards){
            System.out.println(idCard.getDesignedBy());
            System.out.println(idCard.getMaterial());
            System.out.println(idCard.getWeight());
        }

    }
}
