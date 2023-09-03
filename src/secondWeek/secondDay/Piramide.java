package secondWeek.secondDay;


import java.sql.SQLOutput;

public class Piramide {

    public static void main(String[] args) {
        for (int i=0; i<10; i++) {
            for (int j = 9; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

//        for (int i=0; i<10; i++) {
//            for (int j = 9; j > i; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }
}
