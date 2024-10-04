package Decorators;

import Interface.Beverage;

public class Decorator implements Beverage {
    private Beverage beverage;
    public Decorator(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public double cost(){
        return beverage.cost();
    }
    @Override
    public String getDescription(){
        return beverage.getDescription();
    }



}
