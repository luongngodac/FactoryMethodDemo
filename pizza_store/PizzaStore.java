package pizza_store;
import pizza.Pizza;
import pizza.PizzaType;
/**
 *
 * @author asus
 */
public abstract class PizzaStore
{
    protected abstract Pizza createPizza(PizzaType type);
    public Pizza orderPizza(PizzaType type)
    {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}