package javaBasicExercises;

public class TwentyOneToThirty {

    public static void main(String[] args) {
        System.out.println("-----------------------------\n21\n");

        int twentyFirst = 29;
        System.out.println(twentyFirst + " : To an octal number : " + Integer.toOctalString(twentyFirst));

        System.out.println("-----------------------------\n22\n");

        String twentySecond = "101010";
        System.out.println(twentySecond + " : convert a binary number to a decimal number : " + Integer.parseInt(twentySecond, 2));

        System.out.println("-----------------------------\n23\n");

        String twentyThird = "1101";
        int twentyThirdNum = Integer.parseInt(twentyThird, 2);
        System.out.println(twentyThird + " : binary to Decimal : " + twentyThirdNum + " : Decimal to hexaDecimal : " + Integer.toHexString(twentyThirdNum));

        System.out.println("-----------------------------\n24\n");

        String twentyFourth = "111";
        int twentyFourthNum = Integer.parseInt(twentyFourth, 2);
        System.out.println(twentyFourth + " : binary to Decimal : " + twentyFourthNum + " : Decimal to octaDecimal : " + Integer.toOctalString(twentyFourthNum));

        System.out.println("-----------------------------\n25\n");

        String twentyFifthOctalNum = "10";

        System.out.println(twentyFifthOctalNum + " : convert a octal number to a decimal number : " + Integer.parseInt(twentyFifthOctalNum, 8));

        System.out.println("-----------------------------\n26\n");


        String twentySixthOctalNum = "7";
        int twentySixthOctalNum2 = Integer.parseInt(twentySixthOctalNum, 8);
        String twentySixthOctalNum3 = Integer.toBinaryString(twentySixthOctalNum2);
        System.out.println(twentySixthOctalNum + " : convert octal num to Decimal : " + twentySixthOctalNum2 + " : to convert a Decimal number to a binary number : " + twentySixthOctalNum3);


        System.out.println("-----------------------------\n27\n");

        String twentySeventhOctalNum = "100";
        int twentySeventhOctalNum2 = Integer.parseInt(twentySeventhOctalNum, 8);
        String twentySeventhNum = Integer.toHexString(twentySeventhOctalNum2);
        System.out.println(twentySeventhOctalNum + " : convert octal num to Decimal : " + twentySeventhOctalNum2 + " : to convert a Decimal number to a hexadecimal number : " + twentySeventhNum);

        System.out.println("-----------------------------\n28\n");

        String twentyEighthHexADecimal = "25";
        int twentyEighthHexToDecimal = Integer.parseInt(twentyEighthHexADecimal,16);
        System.out.println(twentyEighthHexADecimal+": to convert a hexadecimal value into a decimal number :" +twentyEighthHexToDecimal);

        System.out.println("-----------------------------\n29\n");

        String twentyNinthHexADecimal = "37";
        int twentyNinthHexToDecimal = Integer.parseInt(twentyNinthHexADecimal,16);
        String twentyNinthDecimalToBinary = Integer.toBinaryString(twentyNinthHexToDecimal);
        System.out.println(twentyNinthHexADecimal+": to convert a hexadecimal value into a decimal number :" +twentyNinthHexToDecimal + ": a Decimal number into a binary :" + twentyNinthDecimalToBinary);

        System.out.println("-----------------------------\n30\n");

        String thirtiethHexADecimal = "40";
        int thirtiethHexToDecimal = Integer.parseInt(thirtiethHexADecimal,16);
        String thirtiethDecimalToBinary = Integer.toOctalString(thirtiethHexToDecimal);
        System.out.println(thirtiethHexADecimal+": to convert a hexadecimal value into a decimal number :" +thirtiethHexToDecimal + ": a Decimal number into a octal :" + thirtiethDecimalToBinary);


    }

}
