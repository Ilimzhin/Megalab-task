package javaBasicExercises;

import java.io.*;
import java.util.Arrays;
import java.util.Random;

public class eightyOneToNinety {
    public static void main(String[] args) {
        System.out.println("\n-----------------------------\n81. Write a Java program to swap the first and last elements of an array (length must be at least 1) and create another array.\n");

        int[] eightyFirst = {20, 30, 40};
        int[] eightyFirstRes = new int[3];
        eightyFirstRes[0] = eightyFirst[2];
        eightyFirstRes[2] = eightyFirst[0];
        eightyFirstRes[1] = eightyFirst[1];
        System.out.println("Original Array: " + Arrays.toString(eightyFirst));
        System.out.println("New array after swaping the first and last elements: " + Arrays.toString(eightyFirstRes));

        System.out.println("\n-----------------------------\n82. Write a Java program to find the largest element between the first, last, and middle values in an array of integers (even length).\n");

        int[] eightySecond = {20, 30, 67, 40, 50};
        System.out.println("Original Array: " + Arrays.toString(eightySecond));
        Arrays.sort(eightySecond);
        System.out.println("Largest element between first, last, and middle values: " + eightySecond[eightySecond.length-1]);

        System.out.println("\n-----------------------------\n83. Write a Java program to multiply the corresponding elements of two integer arrays.\n");

        int[] eightyThird1 = {1, 3, -5, 4};
        int[] eightyThird2 = {1, 4, -5, -2};
        System.out.println("Array1: " + Arrays.toString(eightyThird1) + "\nArray2: " + Arrays.toString(eightyThird2));
        System.out.printf("Result: [%d, %d, %d, %d]\n", eightyThird1[0]*eightyThird2[0],
                                                eightyThird1[1]*eightyThird2[1],
                                                eightyThird1[2]*eightyThird2[2],
                                                eightyThird1[3]*eightyThird2[3]);

        System.out.println("\n-----------------------------\n84. Write a Java program to take the last three characters from a given string. " +
                "It will add the three characters at both the front and back of the string. " +
                "String length must be greater than three and more.\n");

        String eightyFourthString = "Python";
        System.out.println(eightyFourthString.substring(3) + eightyFourthString + eightyFourthString.substring(3));

        System.out.println("\n-----------------------------\n85. Write a Java program to check if a string starts with a specified word.\n");

        String eightyFifth = "Hello how are you?";
        System.out.println(eightyFifth.substring(0,5).equalsIgnoreCase("hello"));

        System.out.println("\n-----------------------------\n86. Write a Java program starting with an integer n, divide it by 2 if it is even, or multiply it by 3 and add 1 if it is odd. Repeat the process until n = 1.\n");

        Random random = new Random();
        int eightySixth = random.nextInt(5,20);
        System.out.println("Random value: " + eightySixth);
        while (eightySixth>1) {
            if (eightySixth%2==0) {
                System.out.printf("%d (even value) %d/2 = ",eightySixth,eightySixth);
                eightySixth = eightySixth/2;
            } else {
                System.out.printf("%d (odded value) %d*3+1 = ",eightySixth,eightySixth);
                eightySixth = eightySixth*3+1;
            }
            System.out.println(eightySixth);
        }

        System.out.println("\n-----------------------------\n87. Write a Java program that then reads an integer and calculates the sum of its digits and writes the number of each digit of the sum in English.\n");

        try {
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter("Out.txt"));
            fileWriter.write("837453");
//            String[] eightySevenths = {"Some1","Some2","Some3","Some4"};
//            for (String eightySeventh: eightySevenths) {
//                fileWriter.write("\n" + eightySeventh);
//            }
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("Out.txt"));
            String line = bufferedReader.readLine();
            System.out.println(line);
            int eightySeventhNum = 0;
            for (int i = 0; i < line.length(); i++) {
                int i1 = Integer.parseInt(String.valueOf(line.charAt(i)));
                eightySeventhNum+=i1;
                System.out.print(i1 + " -> ");
                switch (i1) {
                    case (0) -> System.out.println("zero");
                    case (1) -> System.out.println("one");
                    case (2) -> System.out.println("two");
                    case (3) -> System.out.println("three");
                    case (4) -> System.out.println("four");
                    case (5) -> System.out.println("five");
                    case (6) -> System.out.println("six");
                    case (7) -> System.out.println("seven");
                    case (8) -> System.out.println("eight");
                    case (9) -> System.out.println("nine");
                    default -> System.out.println("only 0-9");
                }
            }
            System.out.println("sum = " +eightySeventhNum);

//            String line;
//            while((line = bufferedReader.readLine()) != null) {
//                System.out.println(line);
//            }
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("\n-----------------------------\n88. Write a Java program to get the current system environment and system properties.\n");

        System.out.println(System.getenv()); // system environment
        System.out.println("-----------");
        System.out.println("-----------");
        System.out.println(System.getProperties()); // system properties

        System.out.println("\n-----------------------------\n89. Write a Java program to check whether a security manager has already been established for the current application or not.\n\n");

//        System.out.println(System.getSecurityManager()); deprecated

        System.out.println("\n-----------------------------\n90. Write a Java program to get the value of environment variables PATH, TEMP, USERNAME\n");

        System.out.println(System.getenv("PATH"));
        System.out.println(System.getenv("TEMP"));
        System.out.println(System.getenv("USERNAME"));

    }
}
