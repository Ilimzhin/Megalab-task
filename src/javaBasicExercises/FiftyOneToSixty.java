package javaBasicExercises;

import java.util.Scanner;

public class FiftyOneToSixty {
    public static void main(String[] args) {
        System.out.println("-----------------------------\n51\n");

        String fiftyOne = "25";
        int fiftyOneInt = Integer.parseInt(fiftyOne);
        System.out.println(fiftyOneInt);

        System.out.println("-----------------------------\n52\n");

        Scanner sc = new Scanner(System.in);
        int fiftySecondNum1 = 5;
        System.out.println("Input the first number : " + fiftySecondNum1);
//        int fiftySecondNum1 = sc.nextInt();
        int fiftySecondNum2 = 10;
        System.out.println("Input the second number : " + fiftySecondNum2);
//        int fiftySecondNum2 = sc.nextInt();
        int fiftySecondNum3 = 15;
        System.out.println("Input the third number : " + fiftySecondNum3);
//        int fiftySecondNum3 = sc.nextInt();
        System.out.print("The result is: ");
        System.out.println(fiftySecondNum3 == fiftySecondNum1 + fiftySecondNum2);

        System.out.println("-----------------------------\n53\n");

        int fiftyThirdNum1 = 5;
        System.out.println("Input the first number : " + fiftyThirdNum1);
//        int fiftyThirdNum1 = sc.nextInt();
        int fiftyThirdNum2 = 10;
        System.out.println("Input the second number : " + fiftyThirdNum2);
//        int fiftyThirdNum2 = sc.nextInt();
        int fiftyThirdNum3 = 15;
        System.out.println("Input the third number : " + fiftyThirdNum3);
//        int fiftyThirdNum3 = sc.nextInt();
        System.out.print("The result is: ");
        Boolean fiftyThirdNum = fiftyThirdNum3 > fiftyThirdNum2 && fiftyThirdNum3 > fiftyThirdNum1 ? true : false;
        System.out.println(fiftyThirdNum);

        System.out.println("-----------------------------\n54\n");

        int fiftyFourthNum1 = 5;
        System.out.println("Input the first number : " + fiftyFourthNum1);
//        int fiftyFourthNum1 = sc.nextInt();
        int fiftyFourthNum2 = 10;
        System.out.println("Input the second number : " + fiftyFourthNum2);
//        int fiftyThirdNum2 = sc.nextInt();
        int fiftyFourthNum3 = 15;
        System.out.println("Input the third number : " + fiftyFourthNum3);
//        int fiftyFourthNum3 = sc.nextInt();
        System.out.print("The result is: ");
        boolean fiftyFourthNum = fiftyFourthNum1 % 10 == fiftyFourthNum2 % 10 || fiftyFourthNum2 % 10 == fiftyFourthNum3 % 10 || fiftyFourthNum1 % 10 == fiftyFourthNum3 % 10 ? true : false;
        System.out.println(fiftyFourthNum);

        System.out.println("-----------------------------\n55\n");

        int fiftyFifthNum = 86399;
        int fiftyFifthNum2 = fiftyFifthNum / 60 / 60;
        System.out.println(fiftyFifthNum2 + ":" + fiftyFifthNum % 60 + ":" + fiftyFifthNum / 60 % 60);

        System.out.println("-----------------------------\n56\n");

        int fiftySixthX = 5;
        int fiftySixthY = 20;
        int fiftySixthP = 3;
        int fiftySixthRes = 0;
        for (int i = fiftySixthX; i <= fiftySixthY; i++) {
            if (i % fiftySixthP == 0) {
                fiftySixthRes++;
            }
        }
        System.out.println(fiftySixthX);

        System.out.println("-----------------------------\n57\n");

        int fiftySeventh = 25;
        int fiftySeventhRes = 0;

        for (int i = 1; i <= fiftySeventh; i++) {
            if (fiftySeventh % i == 0) {
                System.out.println(i);
                fiftySeventhRes++;
            }
        }
        System.out.println(fiftySeventhRes);

        System.out.println("-----------------------------\n58\n");

        String fiftyEighth = "the quick brown fox jumps over the lazy dog";


        char[] charArray = fiftyEighth.toCharArray();
        boolean foundSpace = true;

        for (int i = 0; i < charArray.length; i++) {

            // if the array element is a letter
            if (Character.isLetter(charArray[i])) {

                // check space is present before the letter
                if (foundSpace) {

                    // change the letter into uppercase
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    foundSpace = false;
                }
            } else {
                // if the new character is not character
                foundSpace = true;
            }
//            System.out.println(fiftyEighth);

//            fiftyEighth = String.valueOf(charArray);
//            System.out.println("Message: " + fiftyEighth);

        }

        fiftyEighth = String.valueOf(charArray);
        System.out.println("Message: " + fiftyEighth);

        System.out.println("-----------------------------\n59\n");

        String fiftyNinth = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.";
        System.out.println(fiftyNinth.toLowerCase());

        System.out.println("-----------------------------\n60\n");

        String sixty = "The quick brown fox jumps over the lazy dog.";
        System.out.println();

    }
}
