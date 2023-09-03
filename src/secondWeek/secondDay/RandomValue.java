package secondWeek.secondDay;

import java.util.Random;

public class RandomValue {

    public static void main(String[] args) {
        int num = 1000;
        int num1 = 0;
        for (int i = 1; i <= num; i++) {
            Random random = new Random();
            int num2 = random.nextInt(1,1000);
                if (num2%2==0) {
                    num1++;
                    System.out.println(num1 + ":" +num2);
                }
        }
        System.out.println(num1/10.0 + "%, четных чисел");
    }
}
