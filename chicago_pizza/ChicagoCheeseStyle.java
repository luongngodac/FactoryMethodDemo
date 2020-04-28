package chicago_pizza;

import pizza.Pizza;

/**
 *
 * @author asus
 */
public class ChicagoCheeseStyle extends Pizza
{
    
    public ChicagoCheeseStyle()
    {
        pizzaStr ="Chào các bạn! Đây là bánh pizza Cheese kiểu Chicago\n";
    }

    @Override
    public void prepare()
    {
        pizzaStr += "Chuẩn bị bột và Cheesse\n";
    }

    @Override
    public void bake()
    {
        pizzaStr += "Nướng ở 200 độ C trong 15 phút\n";
    }
    
}