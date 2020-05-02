package pizza_store;
import pizza.Pizza;
import pizza.PizzaType;
public abstract class PizzaStore
{
    protected abstract Pizza createPizza(PizzaType type);
    private static PizzaStore pizza_store;

    public Pizza orderPizza(PizzaType type)
    {
        Pizza pizza_store = createPizza(type);
        pizza_store.prepare();
        pizza_store.bake();
        pizza_store.cut();
        pizza_store.box();
        return pizza_store;
    }
}

