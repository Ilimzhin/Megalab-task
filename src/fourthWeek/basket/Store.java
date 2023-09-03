package fourthWeek.basket;

import java.util.Arrays;

public class Store {
    private Basket[] basket;
    private Category[] categories;
    static int selectedCategory, selectedProduct;

    public void assortment() {
        // Bakery department:
        Product bread = new Product("Bread", 20, 95.5);
        Product flatbread = new Product("Flatbread", 25, 98.3);
        Product buns = new Product("Buns", 40, 92.7);
        // Dairy department:
        Product milk = new Product("Milk", 75, 85.2);
        Product cheese = new Product("Cheese", 120, 90.4);
        Product butter = new Product("Butter", 95, 96.8);
        // Categories:
        Category bakery = new Category("Bakery", new Product[]{bread, flatbread, buns});
        Category dairy = new Category("Dairy department", new Product[]{milk, cheese, butter});
        categories = new Category[] {bakery, dairy};
    }

    void transaction() {
        assortment();
        actionProducts(actionCategory());
        if (addToBasket()) transaction();
        else {
            System.out.println("Your products in basket: " + Arrays.toString(basket));
            System.exit(0);
        }
    }

    private int actionCategory() {
        assortment();
        int selectCategory;
        System.out.println("--- Categories ---");
        for (int i = 0; i < categories.length; i++) {
            System.out.printf("%d. %s\n", (i + 1), categories[i].getName());
        }
        while (true) {
            try {
                System.out.print("• Select category: ");
                selectCategory = Initialization.scanner.nextInt();
                if (selectCategory > categories.length || selectCategory + (categories.length - 1) < categories.length) {
                    Initialization.localNotifications(1);
                } else {
                    selectedCategory = selectCategory - 1;
                    break;
                }
            } catch (java.util.InputMismatchException e) {
                Initialization.localNotifications(1);
                Initialization.scanner.nextLine();
            }
        }
        return selectCategory;
    }

    private void actionProducts(int categoryNumber) {
        assortment();
        categoryNumber--;
        System.out.printf("--- %s ---\n", categories[categoryNumber].getName());
        int selectProduct;
        categories[categoryNumber].parseProducts();
        while (true) {
            try {
                System.out.print("• Select product: ");
                selectProduct = Initialization.scanner.nextInt();
                if (selectProduct > categories[categoryNumber].getProducts().length || selectProduct + (categories[categoryNumber].getProducts().length - 1) < categories[categoryNumber].getProducts().length) {
                    Initialization.localNotifications(1);
                } else {
                    selectedProduct = selectProduct - 1;
                    break;
                }
            } catch (java.util.InputMismatchException e) {
                Initialization.localNotifications(1);
                Initialization.scanner.nextLine();
            }
        }
    }
    static int counter = 0;
    private boolean addToBasket() {
        int repeatDialog;

        // addToBasket block.

        System.out.println("Repeat operation?\n1. Yes\n2. No");
        while (true) {
            try {
                System.out.print("• Enter your answer: ");
                repeatDialog = Initialization.scanner.nextInt();
                if (repeatDialog < 1 || repeatDialog > 2) Initialization.localNotifications(1);
                else if (repeatDialog == 1) return true;
                else if (repeatDialog == 2) return false;
                else Initialization.localNotifications(2);
            } catch (java.util.InputMismatchException e) {
                Initialization.localNotifications(1);
                Initialization.scanner.nextLine();
            }
        }
    }
}