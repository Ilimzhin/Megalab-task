import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String hello = "hello";
        String hello2 = hello;

        for (int i = 0; i < 5; i++) {
            hello+="-";
        }
        System.out.println(hello);
        System.out.println(hello2);



//        example1();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите первый операнд");
//        double num = sc.nextDouble();
//        System.out.println("Введите второй операнд");
//        double num2 = sc.nextDouble();
//        System.out.println("Введите Оператор \n 1-(/) \n 2-(*) \n 3-(-) \n 4-(+)");
//        int operators = sc.nextInt();
//
//        switch (operators) {
//            case 1:
//                double num3 = num/num2;
//                System.out.println(num + " / " + num2 + " = " + num3);
//                break;
//            case 2:
//
//                double num4 = num*num2;
//                System.out.println(num + " * " + num2 + " = " + num4);
//                break;
//            case 3:
//
//                double num5 = num-num2;
//                System.out.println(num + " - " + num2 + " = " + num5);
//                break;
//            case 4:
//
//                double num6 = num+num2;
//                System.out.println(num + " + " + num2 + " = " + num6);
//                break;
//            default:
//                System.out.println("Неверный оператор");
//        }

    }
    public static void strKtr(String str) {
        String ktr = str;
        System.out.println(ktr.hashCode());
    }

    public static void example1() {
        System.out.println("lop");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        example2();

    }
    public static void example2() {
        System.out.println("lol");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        example1();
    }
}