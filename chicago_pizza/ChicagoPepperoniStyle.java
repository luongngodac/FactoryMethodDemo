package chicago_pizza;
import pizza.Pizza;

/**
 *
 * @author asus
 */
public class ChicagoPepperoniStyle extends Pizza
{

    public ChicagoPepperoniStyle()
    {
        pizzaStr = "Chào các bạn! Đây là pizza pepperoni kiểu Chicago\n";
    }
    @Override
    public void prepare()
    {
        pizzaStr +="Chuẩn bị bột với hành\n";
    }

    @Override
    public void bake()
    {
        pizzaStr +="Nướng ở 250 độ C trong 10 phút\n";
    }
    
}