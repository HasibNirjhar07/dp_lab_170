package Bundles;

import Interface.Product;

import java.util.ArrayList;
import java.util.List;

public abstract class Bundle implements Product {

    private String name;
    private double discount;

    protected List<Product> items=new ArrayList<>();

    public Bundle(String name, double discount) {
        this.name = name;
        this.discount = discount;
    }


    public void addProduct(Product product){
        items.add(product);
    }


    @Override

    public double getPrice() {
        double price=0;
        for(Product product:items){
            price+=product.getPrice();
        }
        return price*(1-discount);
    }

    @Override
    public void showDetails() {
        System.out.println("******************************************");
        System.out.println("Bundle: " + name + ", Price: " + getPrice());
        for(Product product:items){
            product.showDetails();
        }
    }

    public abstract void build();


}
