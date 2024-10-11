import Bundles.Bundle;
import Bundles.TechBundle;
import Products.SimpleProduct;

public class Main {

    public static void main(String[] args) {

        SimpleProduct Laptop = new SimpleProduct("Laptop", 1000,"Asus Rog");
        Laptop.showDetails();
        SimpleProduct Mouse = new SimpleProduct("Mouse", 50,"Logitech");
        Mouse.showDetails();
        SimpleProduct Keyboard = new SimpleProduct("Keyboard", 150,"Razer");
        Keyboard.showDetails();

        SimpleProduct Monitor = new SimpleProduct("Monitor", 200,"Samsung");
        Monitor.showDetails();

        SimpleProduct Headphones = new SimpleProduct("Headphones", 100,"Sony");

        TechBundle techBundle = new TechBundle();
        techBundle.build();

        techBundle.showDetails();






    }
}
