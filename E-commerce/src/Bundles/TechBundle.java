package Bundles;


import Products.SimpleProduct;

public class TechBundle extends Bundle{

    public TechBundle(){
        super("TechBundle", 0.1);
    }




    @Override
    public void build() {

        items.add(new SimpleProduct("Laptop", 1000,"Asus Rog"));

        items.add(new SimpleProduct("Mouse", 50,"Logitech"));

        items.add(new SimpleProduct("Keyboard", 150,"Razer"));





    }
}
