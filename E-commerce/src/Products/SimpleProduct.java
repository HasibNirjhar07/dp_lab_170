package Products;

import Interface.Product;

public class SimpleProduct implements Product {
    private double price;
    private String name;

    private String description;

    public SimpleProduct(String name, double price, String description) {
        this.price = price;
        this.name = name;
        this.description = description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void showDetails() {
        System.out.println("Product: " + name + ", Price: " + price + ", Description: " + description);
    }
}

