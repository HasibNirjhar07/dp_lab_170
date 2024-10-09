

import Condiments.Milk;
import Condiments.WhippedCream;
import Condiments.WhiteSugar;
import Interface.Beverage;

public class BeverageBuilder {

    private Beverage beverage;

    public BeverageBuilder(Beverage beverage){
        this.beverage = beverage;
    }

    public BeverageBuilder addWhiteSugar(){
        return new BeverageBuilder(new WhiteSugar(beverage));
    }

    public BeverageBuilder addMilk(){
        return new BeverageBuilder(new Milk(beverage));
    }


    public BeverageBuilder addWhippedCream(){
        return new BeverageBuilder(new WhippedCream(beverage));
    }

    public Beverage build(){
        return beverage;
    }

}
