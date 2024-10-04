package Beverages;

import Interface.Beverage;

public class Espresso implements Beverage {

    @Override
    public double cost()
    {
        return 2.00;
    }

    @Override
    public String getDescription()
    {
        return "Espresso";
    }
}
