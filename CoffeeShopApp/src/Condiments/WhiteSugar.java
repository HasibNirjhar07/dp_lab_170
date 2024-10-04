package Condiments;
import Decorators.Decorator;
import Interface.Beverage;

public class WhiteSugar extends Decorator{

    public WhiteSugar(Beverage beverage){
        super(beverage);
    }

    @Override
    public double cost(){
        return super.cost() + 0.5;
    }

    @Override
    public String getDescription(){
        return super.getDescription() + " with White Sugar";
    }




}
