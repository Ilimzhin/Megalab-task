package fourthWeek.basket;


import java.util.Arrays;

public class Category {
    private String name;
    private Product[] products;

    public Category(String name, Product[] products) {
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Category: " +
                "\nname: " + name +
                "\nproducts: " + Arrays.toString(products).replace("[", "").replace("]", "");
    }

    public void parseProducts() {
        for (int i = 0; i < products.length; i++) System.out.printf("%d. %s\n", (i + 1), products[i].toString());
    }
}
