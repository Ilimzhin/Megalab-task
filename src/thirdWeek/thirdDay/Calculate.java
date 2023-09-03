package thirdWeek.thirdDay;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Calculate {

    Scanner sc = new Scanner(System.in);
    int getInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первый операнд: ");
        return scanner.nextInt();
    }
    char getOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите оператор: (+),(-),(/),(*) ");
        return scanner.next().charAt(0);
    }
    int calc(int num1, char operation, int num2) {
        int result = 0;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("не дели на ноль!!!");
                }
                break;
            default:
                System.out.println("не правильный оператор");
        }
        System.out.printf("%d %c %d = %d",num1, operation,num2, result);
        return result;
    }

    void calculate() {

        System.out.println("Введите первый операнд");
        double num = sc.nextDouble();
        System.out.println("Введите Оператор \n 1-(/) \n 2-(*) \n 3-(-) \n 4-(+)");
        int operators = sc.nextInt();
        System.out.println("Введите второй операнд");
        double num2 = sc.nextDouble();
        switch (operators) {
            case 1:
                double num3 = num/num2;
                System.out.println(num + " / " + num2 + " = " + num3);
                break;
            case 2:

                double num4 = num*num2;
                System.out.println(num + " * " + num2 + " = " + num4);
                break;
            case 3:

                double num5 = num-num2;
                System.out.println(num + " - " + num2 + " = " + num5);
                break;
            case 4:

                double num6 = num+num2;
                System.out.println(num + " + " + num2 + " = " + num6);
                break;
            default:
                System.out.println("Неверный оператор");
        }

    }
}
