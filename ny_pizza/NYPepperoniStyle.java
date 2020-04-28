package ny_pizza;
import pizza.Pizza;
public class NYPepperoniStyle extends Pizza
{
    public NYPepperoniStyle()
    {
        pizzaStr ="Chào các bạn! Đây là bánh pizza Pepperoni kiểu New York\n";
    }

    @Override
    public void prepare()
    {
        pizzaStr += "Chuẩn bị bột và Pepperoni và Muối\n";
    }

    @Override
    public void bake()
    {
        pizzaStr += "Nướng ở 240 độ C trong 15 phút\n";
    }
}