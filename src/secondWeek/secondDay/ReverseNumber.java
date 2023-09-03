package secondWeek.secondDay;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число для обратной записи");
        int num = sc.nextInt();
        String number = String.valueOf(num);// num в String
        char[] num1 = number.toCharArray();// String в char[] массив из чаров
        System.out.println("Элементы в обратном порядке");
        for (int i = num1.length - 1; i >= 0; i--) {
            System.out.print(num1[i]);
        }
    }
}
