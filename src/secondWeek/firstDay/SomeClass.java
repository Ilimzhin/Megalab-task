package secondWeek.firstDay;

import java.util.Scanner;

public class SomeClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите x ");
        int x = sc.nextInt();
        System.out.println("Введите y ");
        int y = sc.nextInt();

        if (x == 0 && y == 0) {
            System.out.println("координата относится ко всем четвертям");
        } else if (x>0&&y>0) {
            System.out.println("Координата в первой координатной четверти");
        } else if(x>0&&y<0) {
            System.out.println("Координата в четвертой координатной четверти");
        } else if(x<0&&y>0) {
            System.out.println("Координата во второй координатной четверти");
        } else if(x<0&&y<0) {
            System.out.println("Координата в втретьей координатной четверти");
        } else if(x==0&&y>0) {
            System.out.println("Координата в первой и второй координатной четверти");
        } else if(x>0&& y==0) {
            System.out.println("Координата в первая и четвертой координатной четверти");
        } else if(x<0&& y==0) {
            System.out.println("Координата в вторая и третья координатной четверти");
        } else if(x==0&& y<0) {
            System.out.println("Координата в втретьей и четвертой координатной четверти");
        }

    }
}

