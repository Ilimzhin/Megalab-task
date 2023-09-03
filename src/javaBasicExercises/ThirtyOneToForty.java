package javaBasicExercises;

import java.nio.charset.Charset;

public class ThirtyOneToForty {

    public static void main(String[] args) {

        System.out.println("-----------------------------\n31\n");
        String thirtyFirstNum1 = System.getProperty("java.version");
        System.out.println("Java Version: " + thirtyFirstNum1);
        String thirtyFirstNum2 = System.getProperty("java.runtime.version");
        System.out.println("Java Runtime Version: " + thirtyFirstNum2);
        String thirtyFirstNum3 = System.getProperty("java.home");
        System.out.println("Java Home: " + thirtyFirstNum3);
        String thirtyFirstNum4 = System.getProperty("java.vendor");
        System.out.println("Java Vendor: " + thirtyFirstNum4);
        String thirtyFirstNum5 = System.getProperty("java.vendor.url");
        System.out.println("Java Vendor URL: " + thirtyFirstNum5);
        String thirtyFirstNum6 = System.getProperty("java.class.path");
        System.out.println("Java Class Path: " + thirtyFirstNum6);

        System.out.println("-----------------------------\n32\n");

        int thirtySecondNum1 = 25;
        int thirtySecondNum2 = 39;
        if (thirtySecondNum1 != thirtySecondNum2) {
            System.out.println(thirtySecondNum1 + " != " + thirtySecondNum2);
        }
        if (thirtySecondNum1 > thirtySecondNum2) {
            System.out.println(thirtySecondNum1 + " > " + thirtySecondNum2);
        }
        if (thirtySecondNum1 >= thirtySecondNum2) {
            System.out.println(thirtySecondNum1 + " >= " + thirtySecondNum2);
        }
        if (thirtySecondNum1 <= thirtySecondNum2) {
            System.out.println(thirtySecondNum1 + " < " + thirtySecondNum2);
        }
        if (thirtySecondNum1 <= thirtySecondNum2) {
            System.out.println(thirtySecondNum1 + " <= " + thirtySecondNum2);
        }

        System.out.println("-----------------------------\n33\n");

        int thirtyThird = 255;
        String thirtyThirdToString = String.valueOf(thirtyThird);
        int thirtyThirdSum = 0;
        for (int i = 0; i < thirtyThirdToString.length(); i++) {
            char thirtyThirdToChar = thirtyThirdToString.charAt(i);
            thirtyThirdSum += Character.digit(thirtyThirdToChar, 10);
        }
        System.out.println("With num (" + thirtyThird + ") sum : " + thirtyThirdSum);

        System.out.println("-----------------------------\n34\n");

        int thirtyFourth = 6;
        double thirtyFourthSum = ((6 * (Math.pow(thirtyFourth, 2))) / (4 * (Math.tan(Math.PI / 6))));
        double thirtyFourthSum2 = (3 * Math.pow(3, 0.5) * Math.pow(thirtyFourth, 2)) / 2;
        System.out.println(thirtyFourthSum);
        System.out.println("compute hexagon area with \nlength a side : " + thirtyFourth + " \nhexagon area : " + thirtyFourthSum2);

        System.out.println("-----------------------------\n35\n");

        int thirtyFifthNumberSide = 7;
        int thirtyFifthLengthSide = 6;
        double thirtyFifthSum = ((thirtyFifthNumberSide * (Math.pow(thirtyFifthLengthSide, 2))) / (4 * (Math.tan(Math.PI / thirtyFifthNumberSide))));
        System.out.println(" compute polygon area with\n length a side : " + thirtyFifthLengthSide + " and\n Number side: " + thirtyFifthNumberSide + "\n hexagon area : " + thirtyFifthSum);

        System.out.println("-----------------------------\n36\n");

        double radius = 6371.01;         //radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
        double thirtySixthLatitudeOfCoordinateNum1 = Math.toRadians(25);
        double thirtySixthLongitudeOfCoordinateNum1 = Math.toRadians(35);
        double thirtySixthLatitudeOfCoordinateNum2 = Math.toRadians(35.5);
        double thirtySixthLongitudeOfCoordinateNum2 = Math.toRadians(25.5);
        double thirtySixthSum = radius * Math.acos(
                (Math.sin(thirtySixthLatitudeOfCoordinateNum1) * Math.sin(thirtySixthLatitudeOfCoordinateNum2)) +
                        ((Math.cos(thirtySixthLatitudeOfCoordinateNum1) * Math.cos(thirtySixthLatitudeOfCoordinateNum2) *
                                Math.cos(thirtySixthLongitudeOfCoordinateNum1 - thirtySixthLongitudeOfCoordinateNum2))));
        System.out.println("Math.toRadians latitude of coordinate 1: " + thirtySixthLatitudeOfCoordinateNum1 +
                "\nMath.toRadians longitude of coordinate 1: " + thirtySixthLongitudeOfCoordinateNum1 +
                "\nMath.toRadians latitude of coordinate 2: " + thirtySixthLatitudeOfCoordinateNum2 +
                "\nMath.toRadians longitude of coordinate 2: " + thirtySixthLongitudeOfCoordinateNum2);
        System.out.println("The distance between those points is: " + thirtySixthSum);

        System.out.println("-----------------------------\n37\n");
        //first solution
        String thirtySeventhString = "The quick brown fox";
        String thirtySeventhResult = "";
        for (int i = 0; i < thirtySeventhString.length(); i++) {
            thirtySeventhResult = thirtySeventhString.charAt(i) + thirtySeventhResult;
        }
        System.out.println(thirtySeventhResult);

        //second solution
        String thirtySeventhString2 = "The quick brown fox";
        char[] thirtySeventhChar = thirtySeventhString2.toCharArray();
        String thirtySeventhResult2 = "";
        for (int i = thirtySeventhString2.length() - 1; i >= 0; i--) {
            thirtySeventhResult2 = thirtySeventhResult2 + thirtySeventhChar[i];
        }
        System.out.println(thirtySeventhResult2);

        //Third solution

        System.out.println("-----------------------------\n38\n"); //дорешать

        String thirtyEighthString = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
//        for (int i = 0; i < thirtyEighthString.length(); i++) {
//            char chars1 = thirtyEighthString.charAt(i);
//
//
//        }

//        char[] thirtyEighthChar = thirtyEighthString.toCharArray();
        for (int i = 0; i < thirtyEighthString.length(); i++) {
            char thirtyEighthChars = thirtyEighthString.charAt(i);
            if (Character.isDigit(thirtyEighthChars)) {
                System.out.print(thirtyEighthChars);
            }

        }

        System.out.println("-----------------------------\n39\n");
        int t = 1;
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                if (i == j) {
                    continue;
                } else {
                    for (int k = 1; k < 5; k++) {
                        if (j == k || i == k) {
                            continue;
                        } else {
                            for (int l = 1; l < 5; l++) {
                                if (k == l || i == l || j == l) {
                                    continue;
                                } else {
                                    System.out.printf(t++ + ": %d %d %d %d\n", i, j, k, l);
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println("-----------------------------\n40\n");

        System.out.println("List of available character sets: ");
        for (String str : Charset.availableCharsets().keySet()) {
            System.out.println(str);
        }


    }
}