package secondWeek.fourthDay;

import java.util.Scanner;

public class amountDayOnYear {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите год:");
        int num = sc.nextInt();


        if (num%4==0 && num%400!=0) {
            System.out.println("високосные год: " + num);
        } else {
            System.out.println("не високосный год");
        }

    }
}
