package secondWeek.secondDay;

import java.util.Arrays;
import java.util.Scanner;

public class BiggestValueOfNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число для вывода максимальной цифры в числе");
        int num = sc.nextInt();
        int numLength = (int) Math.log10(num);//log10(48484) 4 10^5 ответ 5
        String number = String.valueOf(num);// num в String
        char[] num1 = number.toCharArray();// String в char[] массив из чаров
        Arrays.sort(num1); // sorted char
        System.out.println("наибольшая цифра натурального числа: " + num1[numLength]);// ласт элемент в массиве
    }

}
