package ny_pizza;
import pizza.Pizza;


public class NYCheeseStyle extends Pizza
{
    public NYCheeseStyle()
    {
        pizzaStr ="Chào các bạn! Đây là bánh pizza Cheese kiểu New York\n";
    }

    @Override
    public void prepare()
    {
        pizzaStr += "Chuẩn bị bột và Cheesse và Muối\n";
    }

    @Override
    public void bake()
    {
        pizzaStr += "Nướng ở 210 độ C trong 15 phút\n";
    }
}