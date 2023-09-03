package secondWeek.fourthDay;

import java.util.Scanner;

public class EvenAndOddNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число");
        int num = sc.nextInt();
        String numChange = String.valueOf(num);
        System.out.println(numChange);

        for (int i = 0; i < numChange.length(); i++) {

            if (numChange.charAt(i)%2==0) {
                System.out.println("Четное число: "+ numChange.charAt(i));
            } else {
                System.out.println("Нечетное число: "+ numChange.charAt(i));
            }
        }

    }
}
