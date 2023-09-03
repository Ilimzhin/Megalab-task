package javaBasicExercises;

import java.io.File;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class fortyOneToFifty {

    public static void main(String[] args) {
        System.out.println("-----------------------------\n41\n");

        char fortyFirst = 'Z';
        System.out.println(fortyFirst + ": " + Integer.valueOf(fortyFirst));

        System.out.println("-----------------------------\n42\n");

        Scanner sc = new Scanner(System.in);
//        String fortySecondPass = sc.nextLine();
        String fortySecondPass = "kolobok";
        System.out.println(fortySecondPass);

        System.out.println("-----------------------------\n43\n");

        String fortyThirdString = "Twinkle, twinkle, little star,\n" +
                "How I wonder what you are!\n" +
                "Up above the world so high,\n" +
                "Like a diamond in the sky.";
        String[] fortyThirdSome = fortyThirdString.split("!");
        System.out.println(fortyThirdSome[0] + "\n-cut-" + fortyThirdSome[1]);

        System.out.println("-----------------------------\n44\n");

        int fortyFourth = 5;
        System.out.printf("%d + %d + %d\n", fortyFourth, fortyFourth * 11, fortyFourth * 111);
        System.out.printf("%d + %d%d + %d%d%d\n", fortyFourth, fortyFourth, fortyFourth, fortyFourth, fortyFourth, fortyFourth);

        System.out.println("-----------------------------\n45\n");

        File fortyFifthFile = new File("/src/javaBasicExercises/Java.txt");
        System.out.println(fortyFifthFile + " : " + fortyFifthFile.length() + " bytes");

        System.out.println("-----------------------------\n46-47\n");
        Date date = new Date();
        System.out.println(LocalDate.now());
        System.out.println(date);

        System.out.println("-----------------------------\n48\n");

        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        System.out.println("-----------------------------\n49\n");

        Random random = new Random();
        int fortyEighth = random.nextInt(1, 1000);
        System.out.println(fortyEighth);
        if (fortyEighth % 2 == 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

        System.out.println("-----------------------------\n50\n");
        int num35;
        int num3;
        int num5;
        System.out.println("Divided by 3: ");
        for (int i = 1; i < 100; i++) {
            if (i%3==0) {
                num3 = i;
                System.out.print(num3 + ", ");
            }
        }
        System.out.println("\nDivided by 5: ");
        for (int i = 1; i < 100; i++) {
            if (i%5==0) {
                num5 = i;
                System.out.print(num5 + ", ");
            }
        }
        System.out.println("\nDivided by 3 & 5: ");
        for (int i = 1; i < 100; i++) {
            if (i%5==0&&i%3==0) {
                num35 = i;
                System.out.print(num35 + ", ");
            }
        }

    }
}
