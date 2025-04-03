package com.xworkz.internal;

public class ProductCategory {
    public ProductCategory(){
        System.out.println("running no args const ");
    }

    public void displayCategory() {
        System.out.println("Displaying product category.");
    }

    public void listProducts() {
        System.out.println("Listing products in this category.");
    }

    public void applyDiscount() {
        System.out.println("Applying discount to products.");
    }

    public void checkStock() {
        System.out.println("Checking stock availability.");
    }

    public void manageReturns() {
        System.out.println("Managing product returns.");
    }
}
