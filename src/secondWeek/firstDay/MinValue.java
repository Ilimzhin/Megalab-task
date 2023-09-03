package secondWeek.firstDay;

import java.util.Scanner;

public class MinValue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        int num1 = sc.nextInt();
        System.out.println("Введите второе число");
        int num2 = sc.nextInt();

        if (num1>num2) {
            System.out.println("Число " + num1 + " Больше, чем " + num2);
        } else {
            System.out.println("Число " + num2 + " Больше, чем " + num1);
        }

    }
}
