package javaBasicExercises;

public class binaryJava {
    public static void main(String[] args) {

        int seventeenthFirstBinary = 1010;
        String stringValue = String.valueOf(seventeenthFirstBinary);
        int seventeenthFirstNum = 0;
        for (int i = 0; i <= stringValue.length() - 1; i++) {
            int seventeenthFirstNum2 = (int) (Integer.parseInt(String.valueOf(stringValue.charAt(i))) * (Math.pow(2, (stringValue.length() - 1 - i))));
            seventeenthFirstNum = seventeenthFirstNum + seventeenthFirstNum2;
        }
        System.out.println(seventeenthFirstNum);

        int seventeenthSecondBinary = 1010;
        String stringValue2 = String.valueOf(seventeenthSecondBinary);
        int seventeenthSecondNum = 0;
        for (int j = 0; j <= stringValue2.length() - 1; j++) {
            int seventeenthSecondNum2 = (int) (Integer.parseInt(String.valueOf(stringValue2.charAt(j))) + (Math.pow(2, (stringValue2.length() - 1 - j))));
            seventeenthSecondNum = seventeenthSecondNum + seventeenthSecondNum2;
        }
        System.out.println(seventeenthSecondNum);

        System.out.println();
        int seventeenthRes = seventeenthFirstNum + seventeenthSecondNum;
        String res3 = Integer.toBinaryString(seventeenthRes);
        System.out.println("бинарное число результата сложения : " + res3);



    }
}