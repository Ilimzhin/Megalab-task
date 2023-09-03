package thirdWeek.secondDay.basket;

import java.util.Scanner;

public class StoreMain {
    public static void main(String[] args) {
        RegistrationAndLogin reg = new RegistrationAndLogin();
        Basket basket = new Basket();

        //"aaZZa44@"

        Product products = new Product("Яблоко", 100, 15.5);
        Product products1 = new Product("Картофель", 200, 8.5);
        Product products2 = new Product("Морковь", 130, 7.5);
        Product products3 = new Product("Молоко", 200, 6.5);
        Product products4 = new Product("Сыр", 700, 7.5);
        Product products5 = new Product("Масло", 600, 9.5);
        Product products6 = new Product("Pen", 500, 10.0);
        Product products7 = new Product("Paper", 400, 10.0);

        Product product[] = {products, products1, products2, products3,
                products4, products5, products6, products7};

        Category category0 = new Category("vegetables", new Product[]{products, products1, products2});
        Category category1 = new Category("Milk", new Product[]{products3, products4, products5});
        Category category2 = new Category("Other", new Product[]{products6, products7});

        Category[] productsCategory = {category0, category1, category2};

        reg.registrationAndLogin(); //регисатрация
        Scanner sc = new Scanner(System.in);
        boolean isActive = true;

        String num = "";
        while (isActive) {
            System.out.println("что бы вывести список категории нажмите 1\nЧто бы выйти нажми 2");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Введите цифру для выбора");
                int i = 0;
                for (Category c : productsCategory) {
                    i++;
                    System.out.println(i+ ": " + c.nameCategory);
                }
                int choiceP = sc.nextInt();
                //-------------------
                int num1 = 0;
                while (isActive) {
                    switch(choiceP) {
                        case 1 -> System.out.println(category0.toString() + "\n");
                        case 2 -> System.out.println(category1.toString() + "\n");
                        case 3 -> System.out.println(category2.toString() + "\n");
                        default -> System.out.println("введите от 1 до 3");
                    }
                    System.out.println("Под каким номером хотите взять продукт");
                    Product product1 = product[choiceP - 1];

                    int choiceProduct = sc.nextInt();

                    num += product1;
                    basket.products[num1] = product[choiceProduct - 1];
                    num1++;
                    System.out.println("Вы набрали: " + num1);
                    System.out.println(basket);
                    System.out.println();
                    System.out.println("\nХотите продолжить (y) или хотит закончить покупки (n)");
                    while (isActive) {
                        String choiceForContinue = sc.nextLine();
                        if (choiceForContinue.equalsIgnoreCase("n")) {
                            isActive = false;
                        } else if (choiceForContinue.equalsIgnoreCase("y")) {
                            break;
                        }
                    }
                    System.out.println();
                }
                //-------------------
            } else if(choice == 2) {
                System.out.println("Досвидание");
                System.exit(0);
            } else {
                System.out.println("Введите число 1");
            }
        }
        System.out.println("вы набрали в итоге" + num);
    }


}
