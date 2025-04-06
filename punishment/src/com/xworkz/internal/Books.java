package com.xworkz.internal;

public class Books extends ProductCategory{
    @Override
    public void displayCategory() {
        System.out.println("Displaying product category.(override)");
    }
    @Override
    public void listProducts() {
        System.out.println("Listing products in this category.(override)");
    }
    @Override
    public void applyDiscount() {
        System.out.println("Applying discount to products.(override)");
    }
    @Override
    public void checkStock() {
        System.out.println("Checking stock availability.(override)");
    }
    @Override
    public void manageReturns() {
        System.out.println("Managing product returns.(override)");
    }
}
