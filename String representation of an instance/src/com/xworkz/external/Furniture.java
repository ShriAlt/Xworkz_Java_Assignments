package com.xworkz.external;

import com.xworkz.internal.ProductCategory;

public class Furniture extends ProductCategory {
    private String name;
    private int quantity;
    private int expireDate;
    public Furniture(String name,int quantity,int expireDate)
    {
        this.expireDate=expireDate;
        this.name=name;
        this.quantity=quantity;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", expireDate=" + expireDate +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println(" code :"+super.hashCode());
        return 211654;
    }
}
