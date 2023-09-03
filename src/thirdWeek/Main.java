package thirdWeek;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class Main {

    public static void main(String[] args) throws InterruptedException {
//        long timeInBeginning = System.currentTimeMillis();
//        Thread.sleep(5000);
//        long timeInTheEnd = System.currentTimeMillis();
//        System.out.println((timeInTheEnd-timeInBeginning)/1000);

        for (int i = 1; i <= 15; i++) {

//            if (i%3==0&&i%5==0) {
//                System.out.println(i + " FizzBuzz");
//            } else if(i%3==0) {
//                System.out.println(i + " Fizz");
//            } else if (i%5==0) {
//                System.out.println(i + " Buzz");
//            } else {
//                System.out.println(i);
//            }


//
//            System.out.println(numTernary);
        }
        Random random = new Random();
//        int i = random.nextInt(1,100);
        long timeInBeginning = System.currentTimeMillis();
//        Thread.sleep(5000);
        int nums = 0;
        while (nums != 15) {
            int i1 = random.nextInt(1, 100);
            nums=i1;
            System.out.println(nums);

        }
        System.out.println("FizzBuzz");
        System.out.println();
        System.out.println();
        System.out.println();
        String res = "";
        while (!res.equals("FizzBuzz")) {
            int num = random.nextInt(1, 1000);

            res = num % 3 == 0 && num % 5 == 0 ? "FizzBuzz" : "";
            String numTernary = num % 3 == 0 && num % 5 == 0 ? num + "FizzBuzz" : num % 3 == 0 ? num + "Fizz" : num % 5 == 0 ? num + "Buzz" : String.valueOf(num);
            System.out.println(numTernary);
        }

        long timeInTheEnd = System.currentTimeMillis();
        System.out.println((timeInTheEnd - timeInBeginning) / 1000);
    }

}
