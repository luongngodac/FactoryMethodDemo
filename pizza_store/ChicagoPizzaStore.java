package pizza_store;
import pizza.Pizza;
import pizza.PizzaType;
import chicago_pizza.ChicagoCheeseStyle;
import chicago_pizza.ChicagoClamStyle;
import chicago_pizza.ChicagoPepperoniStyle;

public class ChicagoPizzaStore extends PizzaStore
{

    @Override
    protected Pizza createPizza(PizzaType type)
    {
        switch(type)
        {
            case cheese: return new ChicagoCheeseStyle();
            case clam: return new ChicagoClamStyle();
            case pepperoni: return new ChicagoPepperoniStyle();
        }  
        return null;
    }
    
}