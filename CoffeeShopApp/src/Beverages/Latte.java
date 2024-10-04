package Beverages;

import Interface.Beverage;

public class Latte implements Beverage {

        @Override
        public double cost()
        {
            return 2.50;
        }

        @Override
        public String getDescription()
        {
            return "Latte";
        }
}
