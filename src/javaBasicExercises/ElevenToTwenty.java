package javaBasicExercises;

import java.util.Scanner;

public class ElevenToTwenty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //11
        System.out.println("-----------------------------\n11\n");

        double tenthRadius = 7.5;
        System.out.println("Radius is = " + tenthRadius);
        double tenthPi = 3.14;
        double tenthArea = tenthPi * Math.pow(tenthPi,2);
        double tenthPerimeter = 2 * tenthPi * tenthRadius;
        System.out.println("Perimeter is = " + tenthArea);
        System.out.println("Area is = " + tenthPerimeter);

        //12
        System.out.println("-----------------------------\n12\n");

//        System.out.println("Введите первое число: ");
//        int twelfthNum1 = sc.nextInt();
//        System.out.println("Введите второе число: ");
//        int twelfthNum2 = sc.nextInt();
//        System.out.println("Введите третье число: ");
//        int twelfthNum3 = sc.nextInt();
//        System.out.println("Среднеарифметическое = " + (twelfthNum2+twelfthNum1+twelfthNum3)/3);

        //13
        System.out.println("-----------------------------\n13\n");

        double thirteenthWidth = 5.5;
        double thirteenthHeight = 8.5;
        System.out.printf("Area is %.1f * %.1f = %.1f\n", thirteenthWidth, thirteenthHeight, thirteenthHeight*thirteenthWidth);
        System.out.printf("Perimeter is 2 * (%.1f + %.1f) = %.1f\n", thirteenthWidth, thirteenthHeight, 2*(thirteenthHeight+thirteenthWidth));

        //14
        System.out.println("-----------------------------\n14\n");

        System.out.println("* * * * * * ==================================\n" +
                           " * * * * *  ==================================\n" +
                           "* * * * * * ==================================\n" +
                           " * * * * *  ==================================\n" +
                           "* * * * * * ==================================\n" +
                           " * * * * *  ==================================\n" +
                           "* * * * * * ==================================\n" +
                           " * * * * *  ==================================\n" +
                           "* * * * * * ==================================\n" +
                           "==============================================\n" +
                           "==============================================\n" +
                           "==============================================\n" +
                           "==============================================\n" +
                           "==============================================\n" +
                           "==============================================");

        //15
        System.out.println("-----------------------------\n15\n");

        int fifteenthNum1 = 25;
        int fifteenthNum2 = 37;
        int fifteenthNum3 = 0;
        System.out.printf("До значения были такими a = %d, b = %d\n", fifteenthNum1, fifteenthNum2);
        fifteenthNum3 = fifteenthNum1;
        fifteenthNum1 = fifteenthNum2;
        fifteenthNum2 = fifteenthNum3;
        System.out.printf("До значения были такими a = %d, b = %d\n", fifteenthNum1, fifteenthNum2);

        //16
        System.out.println("-----------------------------\n16\n");

        System.out.println(" +\"\"\"\"\"+\n" +
                           "[| o o |]\n" +
                           " |  ^  | \n" +
                           " | '-' | \n" +
                           " +-----+\n\n5");
        System.out.println("⣶⣾⣷⣦⡀⠀⣤⣤⣤⣤⣄⠀⣤⣤⣤⣤⣤⣤⣤\n" +
                           "⣾⣿⠁⢸⣿⣧⠀⣿⣿⠉⠹⣿⣆⠉⠉⠉⠉⣿⣿⠟\n" +
                           "⣿⣿⠀⠘⠛⠛⠀⣿⣿⠀⠀⣿⣿⠀⠀⠀⣼⣿⡟\n" +
                           "⣿⣿⠀⠀⠀⠀⠀⣿⣿⣤⣾⡿⠃⠀⠀⣼⣿⡟\n" +
                           "⣿⣿⠀⠀⠀⠀⠀⣿⣿⢻⣿⣇⠀⠀⠀⣿⣿⠁\n" +
                           "⣿⣿⠀⢸⣿⣷⠀⣿⣿⠀⣿⣿⡄⠀⠀⣿⣿\n" +
                           "⢻⣿⣦⣼⣿⠏⠀⣿⣿⠀⢸⣿⣧⠀⢀⣿⣿\n" +
                           "⠈⠛⠛⠛⠋⠀⠀⠛⠛⠀⠀⠛⠛⠀⠸⠛⠛\n" +
                           "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⣿⣦⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                           "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣿⣿⠂⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                           "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⣿⣀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                           "⠀⠀⠀⠀⠀⠀⠀⢠⣾⣿⣿⣿⣿⣿⣿⣦⠀\n" +
                           "⠀⠀⠀⠀⠀⠀⣴⣿⢿⣷⠒⠲⣾⣾⣿⣿\n" +
                           "⠀⠀⠀⠀⣴⣿⠟⠁⠀⢿⣿⠁⣿⣿⣿⠻⣿⣄⠀⠀⠀⠀\n" +
                           "⠀⠀⣠⡾⠟⠁⠀⠀⠀⢸⣿⣸⣿⣿⣿⣆⠙⢿⣷⡀⠀⠀\n" +
                           "⣰⡿⠋⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⠀⠀⠉⠻⣿⡀\n" +
                           "⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⣿⣿⣿⣿⣿⣿⣆⠂⠀\n" +
                           "⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⡿⣿⣿⣿⣿⡄⠀⠀⠀⠀\n" +
                           "⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⠿⠟⠀⠀⠻⣿⣿⡇⠀⠀⠀⠀\n" +
                           "⠀⠀⠀⠀⠀⠀⢀⣾⡿⠃⠀⠀⠀⠀⠀⠘⢿⣿⡀⠀⠀⠀\n" +
                           "⠀⠀⠀⠀⠀⣰⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣷⡀⠀⠀\n" +
                           "⠀⠀⠀⠀⢠⣿⠟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⣿⣧⠀⠀\n" +
                           "⠀⠀⠀⢀⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣆⠀\n" +
                           "⠀⠀⠠⢾⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣷⡤⠄");


        //17
        System.out.println("-----------------------------\n17\n");

//        int seventeenthFirstBinaryNumber = 2;
//        String s = Integer.toBinaryString(seventeenthFirstBinaryNumber);
//        System.out.println(s);

        System.out.println("----");

        int seventeenthFirstBinary = 101010;
        String stringValue = String.valueOf(seventeenthFirstBinary);
        int seventeenthFirstNum=0;
        for (int i = 0; i <= stringValue.length()-1 ; i++) {
//            System.out.print(stringValue.charAt(Integer.parseInt(String.valueOf(i))));
            int seventeenthFirstNum2 = (int) (Integer.parseInt(String.valueOf(stringValue.charAt(i))) * (Math.pow(2, (stringValue.length()-1-i))));
//            System.out.println(" Цифра - " + seventeenthFirstNum2);
            seventeenthFirstNum=seventeenthFirstNum+seventeenthFirstNum2;
        }
        System.out.println(seventeenthFirstNum);

        int seventeenthSecondBinary = 10;
        String stringValue2 = String.valueOf(seventeenthSecondBinary);
        int seventeenthSecondNum=0;
        for (int j = 0; j <= stringValue2.length()-1; j++) {
//            System.out.print(stringValue2.charAt(Integer.parseInt(String.valueOf(i))));
//            System.out.println("???"+ (stringValue2.length()-1-i));
            int seventeenthSecondNum2 = (int) (Integer.parseInt(String.valueOf(stringValue2.charAt(j))) + (Math.pow(2, (stringValue2.length()-1-j))));
//            System.out.println(" Цифра - " + seventeenthSecondNum2);
            seventeenthSecondNum=seventeenthSecondNum+seventeenthSecondNum2;
        }
//        System.out.println(seventeenthSecondNum);

        System.out.println();
        int seventeenthRes = seventeenthFirstNum+seventeenthSecondNum;
        String res3 = Integer.toBinaryString(seventeenthRes);
        System.out.println("бинарное число результата сложения : " + res3);

        System.out.println("10 \n11\n"+(Integer.toBinaryString(Integer.parseInt("10", 2)+Integer.parseInt("11", 2))));


        System.out.println("-----------------------------\n18\n");

        System.out.println("10 \n11\n"+(Integer.toBinaryString(Integer.parseInt("10", 2)*Integer.parseInt("11", 2))));

        System.out.println("-----------------------------\n19\n");
        int nineteenthNum  = 5;
        System.out.println(Integer.toBinaryString(nineteenthNum));

        System.out.println("-----------------------------\n20\n");

        Integer twentiethNum = 14;

        // Бинарный формат числа
        String convert = Integer.toBinaryString(twentiethNum);
        System.out.println(convert);

        // Восьмиричная форма
        convert = Integer.toOctalString(twentiethNum);
        System.out.println(convert);

        // Шеснадцатиричная форма
        convert = Integer.toHexString(twentiethNum);
        System.out.println(convert);
    }
}
