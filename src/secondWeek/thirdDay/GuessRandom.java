package secondWeek.thirdDay;

import java.util.Random;
import java.util.Scanner;

public class GuessRandom {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int randomValue = random.nextInt(1, 100);
        System.out.println(randomValue);
        int count = 0;
        while (count<5) {
            count++;
            System.out.println("ВВведите число");
            int guessRandom = sc.nextInt();
            if (guessRandom != randomValue) {
                System.out.println("Вы не угадали число");
                if (guessRandom<randomValue) {
                    System.out.println("Больше");
                } else System.out.println("Меньше");

            } else {
                System.out.println("Вы отгадали, число: " + randomValue);
                break;
            }
        }
//        System.out.println(count);
        if (count>5) {
            System.out.println("вы не отгадали за 3 попыток, число было " + randomValue);
        }
    }
}


