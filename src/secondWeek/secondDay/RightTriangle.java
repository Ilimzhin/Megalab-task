package secondWeek.secondDay;

import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numm = sc.nextInt();
        for (int i = 1; i < numm; i++) {
            System.out.print(" ");
            for (int j = 1; j < i; j++) {
                System.out.print(j);
            }
            System.out.println();

        }
    }
}
