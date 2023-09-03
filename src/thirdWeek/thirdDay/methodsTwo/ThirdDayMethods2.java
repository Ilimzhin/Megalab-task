package thirdWeek.thirdDay.methodsTwo;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ThirdDayMethods2 {
    Random random = new Random();
    Scanner sc = new Scanner(System.in);
//
//    void setSortedValue() {
//        int[] sortedValue = new int[100];
//        for (int i = 0; i < sortedValue.length; i++) {
//            int randomValue = random.nextInt(1,100);
//            sortedValue[i] = randomValue;
//        }
//        Arrays.sort(sortedValue);
//        System.out.println(Arrays.toString(sortedValue));
//    }
//    void vowelsLetter(String vowelsLetter) {
//        String vowelsLet = "EUIOAeuioa";
//        int res = 0;
//        for (int i = 0; i < vowelsLetter.length(); i++) {
//            String c = String.valueOf(vowelsLetter.charAt(i));
//            if (vowelsLet.contains(c)) {
//                res++;
//            }
//        }
//        System.out.println(res);
//    }

    void validPassword() {
        boolean isActive = true;
        for (;isActive;) {
            System.out.println("Введите пароль: ");
            String response = sc.next();

            int allValidValueNum = 0;
            String allValidValue = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
            for (int i = 0; i < response.length(); i++) {
                if (allValidValue.contains(String.valueOf(response.charAt(i)))==false) {
                    allValidValueNum++;
                }
            }
            if (allValidValueNum>0) {
                System.out.println("Пароль должен содержать только буквы и цифры");
            }

            int amountDigit = 0;
            for (int i = 0; i < response.length(); i++) {
                if(Character.isDigit(response.charAt(i))) {  // количсетво цифр в строке
                    amountDigit++;
                }
            }
            if (amountDigit<2) {
                System.out.println("Пароль должен содержать минимум 2 цифры");
            }
            if (response.length()<10) {
                System.out.println("Пароль не должен быть меньше 10 символов");
            }
            if (response.length()>=10&&amountDigit>=2&&allValidValueNum<1) {
                System.out.println("Вы успешно зашли: Поздравляю!!");
                break;
            }

        }
    }

//    void matrixWithDigit() {
//        System.out.println("Введите размер матрицы: ");
//        int matrixSize = sc.nextInt();
//        for (int i = 0; i < matrixSize; i++) {
//            for (int j = 0; j < matrixSize; j++) {
//                int randomMatrixDigit = random.nextInt(0,2);
//                System.out.print(randomMatrixDigit + " ");
//            }
//            System.out.println();
//        }
//    }
//
//    void find () {
//        int [][] matrix = {
//                { 0, 50, -4, 4, -99, 76, -71},
//                { 80, -9, 10, -11, 12, -13, 14},
//                {-19, 16, -10, 18, -55, 20, -21},
//                { 44, -99, 23, -74, 54, -33, 39}
//        };
//        int matrixAmountNegative=0;
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.print(matrix[i][j] + " ");
//                if(matrix[i][j] <0) {
//                    matrixAmountNegative++;
//                }
//            }
//            System.out.println();
//        }
//        System.out.println("Количество отрицательных элементов: " + matrixAmountNegative);
//        System.out.println("---------------");
//        System.out.println("---------------");
////        System.out.println(Arrays.deepToString(matrix));
//        for (int[] m: matrix) {
////            System.out.println(Arrays.toString(m));
//            for (int n :m) {
//                System.out.print(n + " ");
//            }
//            System.out.println();
//        }
//    }

}
