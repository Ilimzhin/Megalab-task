package javaBasicExercises;

import java.util.Random;

public class SixtyOneToSeventy {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("-----------------------------\n61. Write a Java program to reverse a word.\n");
        String sixtyFirstString = "ABCDefg";
        System.out.println(sixtyFirstString);
        for (int i = sixtyFirstString.length()-1; i >= 0 ; i--) {
            System.out.print(sixtyFirstString.charAt(i));
        }

        System.out.println("\n-----------------------------\n62. Write a Java program that accepts three integer values and returns true if one is 20 or more less than the others' subtractions\n");

        int sixtySecondNum1 = 15;
        int sixtySecondNum2 = 20;
        int sixtySecondNum3 = 25;
        if (Math.abs(sixtySecondNum1 - sixtySecondNum2) >= 20){
            System.out.println(true);
        } else if (Math.abs(sixtySecondNum2 - sixtySecondNum3) >= 20) {
            System.out.println(true);
        } else if (Math.abs(sixtySecondNum3 - sixtySecondNum1) >= 20) {
            System.out.println(true);
        }else {
            System.out.println(false);
        }

        System.out.println("\n-----------------------------\n63. Write a Java program that accepts two integer values from the user and returns the largest value. " +
                "However if the two values are the same, return 0 and find the smallest value if the two values have the same remainder when divided by 6.\n");

        int sixtyThirdNum1 = random.nextInt(10,100);
        int sixtyThirdNum2 = random.nextInt(10,100);
        System.out.println(sixtyThirdNum1);
        System.out.println(sixtyThirdNum2);
        if (sixtyThirdNum1==sixtyThirdNum2) {
            System.out.println(0);
        } else if (sixtyThirdNum1%6==sixtyThirdNum2%6) {
            System.out.println(sixtyThirdNum1<sixtyThirdNum2?"" + sixtyThirdNum1:"" +sixtyThirdNum2);
        } else {
            System.out.println(sixtyThirdNum1>sixtyThirdNum2?"" + sixtyThirdNum1:"" +sixtyThirdNum2);
        }


        System.out.println("\n-----------------------------\n64. Write a Java program that accepts two integer values between 25 and 75 and returns true " +
                "if there is a common digit in both numbers.\n");


        int sixtyFourthNum1 = random.nextInt(25,75);
        int sixtyFourthNum2 = random.nextInt(25,75);
        System.out.println(sixtyFourthNum1+"\n"+sixtyFourthNum2);

        int sixtyFourthNum3 = sixtyFourthNum1%10;
        int sixtyFourthNum4 = sixtyFourthNum2%10;
        sixtyFourthNum1/=10;
        sixtyFourthNum2/=10;
        if (sixtyFourthNum1 == sixtyFourthNum2 || sixtyFourthNum1 == sixtyFourthNum3|| sixtyFourthNum1 == sixtyFourthNum4 || sixtyFourthNum3 == sixtyFourthNum2 ||sixtyFourthNum4 == sixtyFourthNum2 || sixtyFourthNum4 == sixtyFourthNum3) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        System.out.println("\n-----------------------------\n65. Write a Java program to calculate the modules of two numbers without using any inbuilt modulus operator.\n" +
                "Sample Output:\n");


        int sixtyFifthNum1 = random.nextInt(10,100);
        int sixtyFifthNum2 = random.nextInt(1,10);
        System.out.print(sixtyFifthNum1+ " % " + sixtyFifthNum2 + " = ");
        System.out.println(Math.abs(sixtyFifthNum1/sixtyFifthNum2*sixtyFifthNum2-sixtyFifthNum1));

        System.out.println("\n-----------------------------\n66. Write a Java program to compute the sum of the first 100 prime numbers.\n");

        int sixtySixth1 = 0;
        for (int i = 2, j = 0; j < 100; i++) {
            if (i%2!=0&&i%3!=0&&i%5!=0&&i%7!=0) {
                sixtySixth1 += i;
                j++;
                System.out.println(j +" "+ i);
            }
        }
//        System.out.println(sixtySixth1+5+7+2+3);

        System.out.println("\n-----------------------------\n67. Write a Java program to insert a word in the middle of another string." +
                "Insert Tutorial in the middle of Python 3.0, so the result will be Python Tutorial 3.0.\n");
        String sixtySeventhString = "Python 3.0";
        String sixtySeventhString2 = "Tutorial";
        System.out.println(sixtySeventhString.substring(0,7) + sixtySeventhString2 + sixtySeventhString.substring(6));
//        lst = s.replace('.', '').split(); //methods replace // убирает


        System.out.println("\n-----------------------------\n68. Write a Java program to create another string of 4 copies of the last 3 characters of the original string. " +
                "The original string length must be 3 and above.\n");
        String sixtyEighthString1 = "Python 3.0";
        String sixtyEighthString2 = "";
        for (int i = 0; i < 4; i++) {
            sixtyEighthString2 += sixtyEighthString1.substring(7);
        }
        System.out.println(sixtyEighthString2);

        System.out.println("\n-----------------------------\n69. Write a Java program to extract the first half of a even string.\n");

        String sixtyNinthString1 = "Python 3.0";
        String sixtyNinthString2 = "";
        int sixtyNinthInt2 = 1;
        for (int i = 0; i < sixtyNinthString1.length(); i++) {
            if (sixtyNinthString1.charAt(i)==' ') {
                break;
            } else {
                sixtyNinthString2 += sixtyNinthString1.charAt(i);
            }
            sixtyNinthInt2++;
        }

        System.out.println(sixtyNinthString2.substring(0,sixtyNinthInt2/2));

        System.out.println("\n-----------------------------\n70. Write a Java program to create a string in the form of short_string + long_string + short_string from two strings." +
                "The strings must not have the same length.\n");

        String seventiethString1 = "Python";
        String seventiethString2 = "Tutorial";
        System.out.println(seventiethString1+seventiethString2+seventiethString1);

    }
}
