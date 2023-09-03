package secondWeek.thirdDay;

import java.util.Scanner;

public class ArabianAndRimsNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число от 1 до 100 ");
        int num = sc.nextInt();
        if (num>100) {
            System.out.println(num + " не входит в допустимые значения ");
        } else if (num==100){
            System.out.println("C");
        } else if (num==0){
            System.out.println("you Invalid");
        } else {

            System.out.println("");
            switch (num / 10) {
                case 1 -> System.out.print("X");
                case 2 -> System.out.print("X" + "X");
                case 3 -> System.out.print("X" + "X" + "X");
                case 4 -> System.out.print("X" + "L");
                case 5 -> System.out.print("L");
                case 6 -> System.out.print("L" + "X");
                case 7 -> System.out.print("L" + "X" + "X");
                case 8 -> System.out.print("L" + "X" + "X" + "X");
                case 9 -> System.out.print("X" + "C");
                case 0 -> System.out.print("");
                default -> System.out.println("Введите корректное число");
            }


            switch (num % 10) {
                case 1 -> System.out.print("I");
                case 2 -> System.out.print("I" + "I");
                case 3 -> System.out.print("I" + "I" + "I");
                case 4 -> System.out.print("I" + "V");
                case 5 -> System.out.print("V");
                case 6 -> System.out.print("V" + "I");
                case 7 -> System.out.print("V" + "I" + "I");
                case 8 -> System.out.print("V" + "I" + "I" + "I");
                case 9 -> System.out.print("I" + "X");
                case 0 -> System.out.print("");
                default -> System.out.println("Введите корректное число");
            }

        }
    }
}
