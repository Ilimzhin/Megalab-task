package secondWeek.fifthDay;

import java.util.Random;

public class SimpleValue {
    public static void main(String[] args) {


        int[] simpleValueNum = new int[30];
        simpleValueNum[0] = 2;
        simpleValueNum[1] = 3;
        simpleValueNum[2] = 5;
        simpleValueNum[3] = 7;
        int num1 = 3;
        for (int i = 10; i < 98; i++) {
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
//                System.out.println(i);
                num1++;
                simpleValueNum[num1] = i;
            }
        }
        for (int res : simpleValueNum) {
            if (res != 0) {
                System.out.println(res);
            }
        }

    }
}
