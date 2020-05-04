package factorry;


import pizza.Pizza;
import pizza.PizzaType;
import pizza_store.ChicagoPizzaStore;
import pizza_store.NYPizzaStore;
import pizza_store.PizzaStore;

/**
 *
 * @author asus
 */
public class Factory
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        // PizzaStore store = new ChicagoPizzaStore();
        // Pizza pizza = store.orderPizza(PizzaType.cheese);
        // System.out.println(pizza.toString());
        
        // PizzaStore nYStore = new NYPizzaStore();
        // Pizza pizza1 = nYStore.orderPizza(PizzaType.clam);
        // System.out.println(pizza1.toString());
        
        //singleton
        
        PizzaStore chicagoStore = ChicagoPizzaStore.Store();
        Pizza chicagoPizza = chicagoStore.orderPizza(PizzaType.cheese);
        System.out.println(chicagoStore.toString());

        PizzaStore nyStore = NYPizzaStore.Store();
        Pizza nyPizza = nyStore.orderPizza(PizzaType.clam);
        System.out.println(nyPizza.toString());

 

    }
    
}