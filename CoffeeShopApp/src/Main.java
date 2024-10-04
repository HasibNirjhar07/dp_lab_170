import Condiments.Milk;
import Condiments.WhippedCream;
import Decorators.Decorator;
import Beverages.Espresso;





public class Main {

    public static void main(String[] args) {

       Decorator beverage = new Milk(new Milk(new WhippedCream(new Espresso())));


         System.out.println(beverage.getDescription());
         System.out.println(beverage.cost());






    }
}
