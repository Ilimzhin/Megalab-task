package secondWeek.firstDay;

import java.util.Scanner;

public class EvenAndOddNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите Число А ");
        int aNumber = sc.nextInt();
        System.out.println("Введите число Б ");
        int bNumber = sc.nextInt();
        System.out.println("Введите число C ");
        int cNumber = sc.nextInt();

        if (aNumber%2==0 || bNumber%2==0 || cNumber%2==0) {
            if (aNumber%2!=0 || bNumber%2!=0 || cNumber%2!=0) {
                System.out.println("YES");
            }
        } else {
            System.out.println("NO");
        }
    }


}
