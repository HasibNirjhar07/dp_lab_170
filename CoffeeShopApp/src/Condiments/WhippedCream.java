package Condiments;
import Decorators.Decorator;
import Interface.Beverage;


public class WhippedCream extends Decorator{
    public WhippedCream(Beverage beverage){
        super(beverage);
    }
    @Override
    public double cost(){
        return super.cost() + 0.5;
    }
    @Override
    public String getDescription(){
        return super.getDescription() + " with Whipped Cream";
    }
}
