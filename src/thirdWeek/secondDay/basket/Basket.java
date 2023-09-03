package thirdWeek.secondDay.basket;

import java.util.Arrays;

public class Basket {
    Product[] products=new Product[10];

    int i =0;
    @Override
    public String toString() {
        return  "fourthWeek.Basket: " +
                "products: " + Arrays.toString(products);
    }
}
