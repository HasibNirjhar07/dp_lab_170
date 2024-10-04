package Beverages;

import Interface.Beverage;


public class Cappuccino implements Beverage
{
    @Override
    public double cost()
    {
        return 3.00;
    }

    @Override

    public String getDescription()
    {
        return "Cappuccino";
    }

}
