package secondWeek.fourthDay;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первую сторону");
        int a = sc.nextInt();
        System.out.println("Введите вторую сторону");
        int b = sc.nextInt();
        System.out.println("Введите третью сторону");
        int c = sc.nextInt();
        boolean res2 = a<b+c && b<a+c && c<a+b? true: false;

        String res = a<b+c && b<a+c && c<a+b? "треугольник существует": "треугольник не существует";

        System.out.println(res);
        System.out.println(res2);
//        System.out.println(a<b+c && b<a+c && c<a+b);
    }
}
