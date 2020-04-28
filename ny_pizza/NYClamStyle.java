package ny_pizza;
import pizza.Pizza;
public class NYClamStyle extends Pizza
{
    public NYClamStyle()
    {
        pizzaStr ="Chào các bạn! Đây là bánh pizza Clam kiểu New York\n";
    }

    @Override
    public void prepare()
    {
        pizzaStr += "Chuẩn bị bột và Clam và Muối\n";
    }

    @Override
    public void bake()
    {
        pizzaStr += "Nướng ở 220 độ C trong 18 phút\n";
    }
}