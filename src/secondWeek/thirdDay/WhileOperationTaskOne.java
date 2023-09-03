package secondWeek.thirdDay;

import java.util.Scanner;

public class WhileOperationTaskOne {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int count = 0;
        while (i<=1000) {
            count++;
            i+=count;
            System.out.print(count + "; ");

        }
        System.out.println();
        int num = 0;
        while (num<101) {
            System.out.println("Введите число");
            int beforeSto = sc.nextInt();

            num = beforeSto;

        }
        System.out.println("Вы ввели число больше 100, ваше число :  " + num);



    }
}
