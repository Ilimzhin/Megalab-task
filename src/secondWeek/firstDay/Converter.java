package secondWeek.firstDay;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ввести единицу измерения которую хотите перевести \n Биты-1\n Байты-2\n Килбайты-3\n Мегабайты-4\n Гигабайт-5");
        System.out.println("---------------");
        int firstEdin = sc.nextInt();
        System.out.println("Ввести единицу измерения в которую хотите перевести \n Биты-1\n Байты-2\n Килбайты-3\n Мегабайты-4\n Гигабайты-5");
        System.out.println("---------------");
        int secondEdin = sc.nextInt();

        System.out.println("введите количество дл подсчета");
        double num1 = sc.nextDouble();

        switch (firstEdin) {
            case 1:
                switch (secondEdin) {
                    case 2 -> System.out.println(num1 * 0.125);
                    case 3 -> System.out.println(num1 * 0.000125);
                    case 4 -> System.out.println(num1 * 0.000000125);
                    case 5 -> System.out.println(num1 * 0.000000000125);
                    default -> System.out.println("don't touch your keyboard)");
                }
                break;
            case 2:
                switch (secondEdin) {
                    case 1 -> System.out.println(num1 * 8);
                    case 3 -> System.out.println(num1 * 0.125);
                    case 4 -> System.out.println(num1 * 0.000000125);
                    case 5 -> System.out.println(num1 * 0.000000000125);
                    default -> System.out.println("don't touch your keyboard)");
                }
                break;
            case 3:
                switch (secondEdin) {
                    case 1 -> System.out.println(1000 * num1 * 8);
                    case 2 -> System.out.println(num1 * 1000);
                    case 4 -> System.out.println(num1 * 0.125);
                    case 5 -> System.out.println(num1 * 0.000000125);
                    default -> System.out.println("don't touch your keyboard)");
                }
                break;
            case 4:
                switch (secondEdin) {
                    case 1 -> System.out.println(num1 * 1000 * 1000 * 8);
                    case 2 -> System.out.println(num1 * 1000 * 1000);
                    case 3 -> System.out.println(num1 * 1000);
                    case 5 -> System.out.println(num1 * 0.125);
                    default -> System.out.println("don't touch your keyboard)");
                }
                break;
            case 5:
                switch (secondEdin) {
                    case 1 -> System.out.println(num1 * 1000 * 1000 * 1000 * 8);
                    case 2 -> System.out.println(num1 * 1000 * 1000 * 1000);
                    case 3 -> System.out.println(num1 * 1000 * 1000);
                    case 4 -> System.out.println(num1 * 1000);
                    default -> System.out.println("don't touch your keyboard)");
                }
                break;
            default:
                System.out.println("don't touch your keyboard)");
        }
    }
}
