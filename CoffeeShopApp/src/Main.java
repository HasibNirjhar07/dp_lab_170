import Beverages.Latte;
import Condiments.Milk;
import Condiments.WhippedCream;
import Decorators.Decorator;
import Beverages.Espresso;
import Interface.Beverage;


public class Main {

    public static void main(String[] args) {


        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " : " + espresso.cost());


        Beverage Latte= new BeverageBuilder(new Latte()).addMilk().addWhippedCream().build();
        System.out.println(Latte.getDescription() + " : " + Latte.cost());

        Beverage Cappuccinho = new BeverageBuilder(new Latte()).addMilk().addWhippedCream().addMilk().build();

        System.out.println(Cappuccinho.getDescription() + " : " + Cappuccinho.cost());












    }
}
