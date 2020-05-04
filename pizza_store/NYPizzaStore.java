/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza_store;

import pizza.Pizza;
import pizza.PizzaType;
import ny_pizza.NYCheeseStyle;
import ny_pizza.NYClamStyle;
import ny_pizza.NYPepperoniStyle;

/**
 *
 * @author asus
 */
public class NYPizzaStore extends PizzaStore
{
    private static NYPizzaStore store;
    protected NYPizzaStore (){}
    public static NYPizzaStore Store()
    {
        if(store == null)
        {
            store = new NYPizzaStore();
        }
        return store;
    }
    @Override
    protected Pizza createPizza(PizzaType type)
    {
        switch(type)
        {
            case cheese: return new NYCheeseStyle();
            case clam: return new NYClamStyle();
            case pepperoni: return new NYPepperoniStyle();
        }  
        return null;
    }
    
}