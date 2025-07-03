package com.xworkz.collection.external;

public class BikeDTO {
    private String name;
    private int price;
    private String model;
    private String type;
    private String year;
    private String brand;

    public String getName() {
        return name;
    }

    public BikeDTO() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BikeDTO(String name, int price, String model, String type, String year, String brand) {
        this.name = name;
        this.price = price;
        this.model = model;
        this.type = type;
        this.year = year;
        this.brand = brand;
    }
}
