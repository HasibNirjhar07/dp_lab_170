package Condiments;

import Interface.Beverage;
import Decorators.Decorator;

public class Milk extends Decorator {
    public Milk(Beverage beverage){
        super(beverage);
    }
    @Override
    public double cost(){
        return super.cost() + 0.5;
    }
    @Override
    public String getDescription(){
        return super.getDescription() + " with Milk";
    }
}
