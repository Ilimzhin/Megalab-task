package javaBasicExercises;

//https://www.w3resource.com/java-exercises/basic/index.php

import java.util.Scanner;

public class OneToTen {
    public static void main(String[] args) {
        //1
        System.out.println("-----------------------------\n1\n");
        System.out.println("Expected Output :\n" + "Hello\n" + "Ilimzhin Valiev");
        //2
        int secondNum1 = 74;
        int secondNum2 = 36;
        System.out.println("-----------------------------\n2\n");
        System.out.println(secondNum1 + "+" + secondNum2 + "=" + secondNum2+ secondNum1);
        //3
        int thirdNum1 = 50;
        int thirdNum2 = 3;
        System.out.println("-----------------------------\n3\n");
        System.out.println(thirdNum1 + "+" + thirdNum2 + "=" + thirdNum1/thirdNum2);

        //4
        int fourthA = -5 + 8 * 6;
        int fourthB = (55+9) % 9;
        int fourthC = 20 + -3*5 / 8;
        int fourthD = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println("-----------------------------\n4\n");
        System.out.println(fourthA + "\n" + fourthB + "\n" + fourthC + "\n" + fourthD);


        Scanner scanner = new Scanner(System.in);

        System.out.println("-----------------------------\n5\n");
        System.out.println("Input first number: ");
//        int fifthA = scanner.nextInt();
        int fifthA = 12;
        System.out.println("Input second number: ");
//        int fifthB = scanner.nextInt();
        int fifthB = 35;
        System.out.printf("%d * %d = %d \n", fifthA, fifthB,fifthA*fifthB);

        System.out.println("-----------------------------\n6\n");

        System.out.println("Input first number: ");
//        int sixthA = scanner.nextInt();
        int sixthA = 7;
        System.out.println("Input second number: ");
//        int sixthB = scanner.nextInt();
        int sixthB = 10;
        System.out.printf("%d + %d = %d", sixthA, sixthB, sixthA+sixthB);
        System.out.println();
        System.out.printf("%d - %d = %d", sixthA, sixthB, sixthA-sixthB);
        System.out.println();
        System.out.printf("%d * %d = %d", sixthA, sixthB, sixthA*sixthB);
        System.out.println();
        System.out.printf("%d / %d = %d", sixthA, sixthB, sixthA/sixthB);
        System.out.println();
        System.out.printf("%d mod %d = %d", sixthA, sixthB, sixthA%sixthB);
        System.out.println();

        System.out.println("-----------------------------\n7\n");

        System.out.println("Введите число: ");
//        int seventhNum = scanner.nextInt();
        int seventhNum = 9;
        for (int i = 1; i < 11; i++) {
            System.out.printf("%d * %d = %d", seventhNum, i, seventhNum*i);
            System.out.println();
        }

        System.out.println("-----------------------------\n8\n");

        System.out.println("   J    a   v     v  a " +
                         "\n   J   a a   v   v  a a" +
                         "\nJ  J  aaaaa   V V  aaaaa" +
                         "\n JJ  a     a   V  a     a");

        System.out.println("-----------------------------\n9\n");

        double ninth = (25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5);
        System.out.println(ninth);

        System.out.println("-----------------------------\n10\n");

        double tenth = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
        System.out.println(tenth);
    }

}
