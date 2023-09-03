package secondWeek.firstDay;

import java.util.Scanner;

public class SumOrMinus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите трехзначное число");
        int inputNum = sc.nextInt();
        int thirdNum = inputNum%10;
        int secondNum = ((inputNum - thirdNum)/10)%10;
        int firstNum = (((inputNum - thirdNum)/10) - secondNum)/10;

        if (inputNum%2==0) {
            int allRes = thirdNum+secondNum+firstNum;
            System.out.println(firstNum + " + " + secondNum + " + " + thirdNum);
            System.out.println(allRes);
        } else {
            int allRes2 = thirdNum*secondNum*firstNum;
            System.out.println(firstNum + " * " + secondNum + " * " + thirdNum);
            System.out.println(allRes2);
        }
    }

}
