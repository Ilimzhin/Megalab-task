package secondWeek.secondDay;

import java.util.Scanner;

public class MoneyBox {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму которую вы хотите накопить: ");
        int amountMoney = sc.nextInt();
        int i = 0;
        while (i < amountMoney) {
            System.out.println("Сколько хотите положить в копилку: ");
            int beginMoney = sc.nextInt();
            i += beginMoney;
            System.out.println("У вас теперь: " + i + " Сом");
        }
        System.out.println("Вы накопили достаточное количество денег: " + i + " - Это больше  " + amountMoney);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Сколько хотите накопить: ");
//        int num = sc.nextInt();
//        boolean notFull = true;
//        for (;notFull;) {
//            System.out.println("Сколько хотите добавить: ");
//            int i = 0;
//            if (i < num) {
//                int beginMoney = sc.nextInt();
//                i += beginMoney;
//                System.out.println("У вас теперь: " + i + " Сом");
//            } else {
//                System.out.println("Вы накопили достаточное количество денег: " + i + " - Это больше " + num);
//                notFull = false;
//            }
//        }
    }

}
