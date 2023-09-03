package thirdWeek.secondDay.basket;

public class Product {

    String productName;
    int productPrice;
    double productRating;


    public Product() {
    }

    @Override
    public String toString() {
        return "\n[Product" +
                "\nproductName: " + productName +
                "\nproductPrice: " + productPrice +
                "\nproductRating: " + productRating + "]\n";
    }


    public Product(String productName, int productPrice, double productRating) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productRating = productRating;
    }
}

