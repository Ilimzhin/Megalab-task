package secondWeek.secondDay;

import java.util.Scanner;

//Пока хочет вычислять человек не останавливать програамму
public class isActiveWorker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isActive = true;
        for (;isActive;) {
            System.out.println("Хотите продолжить y/n");
            String response = sc.next();
            if (response.equalsIgnoreCase("n")) {
                isActive =false;
                System.out.println("Выходим из программы");
            } else {
                System.out.println("doing some operations");
                System.out.println("Введите первый операнд");
                double num = sc.nextDouble();
                System.out.println("Введите второй операнд");
                double num2 = sc.nextDouble();
                System.out.println("Введите Оператор \n 1-(/) \n 2-(*) \n 3-(-) \n 4-(+)");
                int operators = sc.nextInt();

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
    }
}
