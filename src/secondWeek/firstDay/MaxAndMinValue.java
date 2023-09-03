package secondWeek.firstDay;

import java.util.Scanner;

public class MaxAndMinValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число ");
        int firstNumber = sc.nextInt();
        System.out.println("Введите второе число ");
        int secondNumber = sc.nextInt();
        System.out.println("Введите третье число ");
        int thirdNumber = sc.nextInt();

        if (firstNumber>secondNumber && firstNumber>thirdNumber) {
            System.out.println("Первое число со значением(" +firstNumber + ") Максимальное");
        } else if(secondNumber>firstNumber && secondNumber>thirdNumber) {
            System.out.println("Второе число со значением(" +secondNumber + ") Максимальное");
        } else if (thirdNumber>firstNumber && thirdNumber>secondNumber) {
            System.out.println("Третье число со значением(" +thirdNumber + ") Максимальное");
        } else {
            System.out.println("Нет максимального числа");
        }

        if (firstNumber<secondNumber && firstNumber<thirdNumber) {
            System.out.println("Первое число со значением(" +firstNumber + ") Минимальное");
        } else if(secondNumber<firstNumber && secondNumber<thirdNumber) {
            System.out.println("Второе число со значением(" +secondNumber + ") Минимальное");
        } else if (thirdNumber<firstNumber && thirdNumber<secondNumber) {
            System.out.println("Третье число со значением(" +thirdNumber + ") Минимальное");
        } else {
            System.out.println("Нет минимального числа");
        }
    }
}
