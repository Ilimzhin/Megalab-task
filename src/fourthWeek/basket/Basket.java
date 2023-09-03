package fourthWeek.basket;

import java.util.Arrays;

public class Basket {
    private Product[] products;

    public Basket() {
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Products in basket: " +
                "\nproducts: " + Arrays.toString(products).replace("[", "").replace("]", "");
    }
}
