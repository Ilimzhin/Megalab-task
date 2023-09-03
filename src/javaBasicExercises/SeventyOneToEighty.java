package javaBasicExercises;

import java.util.Arrays;

public class SeventyOneToEighty {

    public static void main(String[] args) {

        System.out.println("\n-----------------------------\n71. Write a Java program to create a string taking the first three characters from a given string. " +
                "If the string length is less than 3 use \"#\" as substitute characters.\n");

        String seventySecondString1 = "Python";
        String seventySecondString2 = "Tutorial";
        System.out.println(seventySecondString1.substring(1) +seventySecondString2.substring(1));

        System.out.println("\n-----------------------------\n72. Write a Java program to create a string taking the first three characters from a given string. " +
                "If the string length is less than 3 use \"#\" as substitute characters.\n");

        String seventyFirstString = " 3";
        if (seventyFirstString.length()<=3) {
            System.out.println("###");
        } else {
            System.out.println(seventyFirstString.substring(0,3));
        }

        System.out.println("\n-----------------------------\n73. Write a Java program to create a string taking the first and last characters from two given strings. " +
                "If the length of each string is 0 use \"#\" for missing characters.\n");

        String seventyThirdString1 = "Python";
        String seventyThirdString2 = "";
        if (seventyThirdString2.length()<1) {
            seventyThirdString2 = "#";
        }
        System.out.println(seventyThirdString1.substring(0,1)+seventyThirdString2.substring(0,1));

        System.out.println("\n-----------------------------\n74. Write a Java program to test if 10 appears as the first or last element of an array of integers. " +
                "The array length must be broader than or equal to 2.\n");

        int[] seventyFourthInt1 = {20, -20, 0, 30, 40, 60, 10};
        System.out.println(seventyFourthInt1[0]==10 || seventyFourthInt1[seventyFourthInt1.length-1] ==10);

        System.out.println("\n-----------------------------\n75. Write a Java program to test if the first and last elements of an array of integers are the same. " +
                "The array length must be broader than or equal to 2.\n");

        int[] seventyFifthInt1 = {50, -20, 0, 30, 40, 60, 10};
        System.out.println(seventyFifthInt1[0]==seventyFifthInt1[seventyFifthInt1.length-1]);

        System.out.println("\n-----------------------------\n76. Write a Java program to test if the first and last element of two integer arrays are the same. " +
                "The array length must be greater than or equal to 2.\n");

        int[] seventySixthInt1 = {50, -20, 0, 30, 40, 60, 12};
        int[] seventySixthInt2 = {45, 20, 10, 20, 30, 50, 11};

        System.out.println(seventySixthInt1[0]==seventySixthInt2[0] || seventySixthInt1[seventySixthInt1.length-1]==seventySixthInt2[seventySixthInt2.length-1]);

        System.out.println("\n-----------------------------\n77. Write a Java program to create an array of length 2 from two integer arrays with three elements. " +
                "The newly created array will contain the first and last elements from the two arrays.\n");

        int[] seventySeventhInt1 = {50, -20, 0};
        int[] seventySeventhInt2 = {5, -50, 10};
        int[] seventySeventhInt3 = new int[2];
        seventySeventhInt3[0] = seventySeventhInt1[0];
        seventySeventhInt3[1] = seventySeventhInt2[seventySeventhInt2.length-1];
        System.out.println(Arrays.toString(seventySeventhInt3));

        System.out.println("\n-----------------------------\n78. Write a Java program to test that a given array of integers of length 2 contains a 4 or a 7.\n");

        int[] seventyEighthInt1 = {4, 7};
        System.out.println(seventyEighthInt1[0]==4 && seventyEighthInt1[1]==7);

        System.out.println("\n-----------------------------\n79. Write a Java program to rotate an array (length 3) of integers in the left direction.\n");

        int[] seventyNinthInt = {20, 30, 40};
        System.out.println("Original Array: " + Arrays.toString(seventyNinthInt));
        System.out.printf("Rotated Array: [%d, %d, %d]",seventyNinthInt[2],seventyNinthInt[1],seventyNinthInt[0]);

        System.out.println("\n-----------------------------\n80. Write a Java program to get the largest value between the first and last elements of an array (length 3) of integers.\n");

        int[] eightieth = {20, 30, 40};
        System.out.println(eightieth[0]>eightieth[2]?eightieth[0]:eightieth[2]);

    }

}
