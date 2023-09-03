package thirdWeek.secondDay.basket;

import java.util.Arrays;

public class Category {

    Product[] product;
    String nameCategory;


    public Category(String nameCategory, Product[] product) {
        this.nameCategory = nameCategory;
        this.product = product;
    }

    @Override
    public String toString() {
        return "Category{" +
                "nameCategory='" + nameCategory + '\'' +
                ", product=" + Arrays.toString(product) +
                '}';
    }
}
