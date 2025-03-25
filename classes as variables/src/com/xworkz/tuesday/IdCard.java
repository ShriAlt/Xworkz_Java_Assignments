package com.xworkz.tuesday;

public class IdCard {
    //IdCard : material,colors[],weight,designedBy
    private String material;
    private int weight;
    private String designedBy;
    private Color color;

    public String getMaterial(){
        return this.material;
    }
    public int getWeight(){
        return this.weight;
    }

    public String getDesignedBy(){
        return this.designedBy;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setDesignedBy(String designedBy) {
        this.designedBy = designedBy;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void showId(Jail[] jails){
        System.out.println("running in idcard");
        if (jails!=null){
            for (Jail jail:jails){
                System.out.println(jail.getJailerName());
                System.out.println(jail.getLocation());
                System.out.println(jail.getName());
                System.out.println(jail.getTotalCells());
            }
        }else System.out.println("can not be null:jails");
    }
}
