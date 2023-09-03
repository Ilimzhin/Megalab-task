package secondWeek.thirdDay;

import java.util.Scanner;

public class CombinationNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Какую сумму нужно найти: ");
        int num1 = sc.nextInt();

        System.out.println("Искомая сумма");
        int num2 = sc.nextInt();

        for (int i = 0; i <= num1; i++) {
            for (int j = 0; j <= num1; j++) {
                for (int k = 0; k <= num1; k++) {
                    int num3 = i+j+k;
                    if (num3==num2) {
                        System.out.println(i + " " + j + " " + k);
                    }
                }

            }

        }
    }

}
