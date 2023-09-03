package javaBasicExercises;

public class ninetyOneToHundred {

    public static void main(String[] args) {
        System.out.println("\n-----------------------------\n91. Write a Java program to measure how long code executes in nanoseconds.\n");
        long startTime = System.nanoTime();
        StringBuffer stringBuffer1 = new StringBuffer("Sbf");
        System.out.print(stringBuffer1 + " ");
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);
        long startTime1 = System.nanoTime();
        StringBuilder stringBuilder1 = new StringBuilder("Sbd");
        System.out.print(stringBuilder1 + " ");
        long endTime1 = System.nanoTime();
        System.out.println(endTime1 - startTime1);
        long startTime2 = System.nanoTime();
        StringBuilder stringBuilder2 = new StringBuilder("Sbd");
        System.out.print(stringBuilder2 + " ");
        long endTime2 = System.nanoTime();
        System.out.println(endTime2 - startTime2);
        long startTime3 = System.nanoTime();
        StringBuffer stringBuffer2 = new StringBuffer("Sbf");
        System.out.print(stringBuffer2 + " ");
        long endTime3 = System.nanoTime();
        System.out.println(endTime3 - startTime3);
        long startTime5 = System.nanoTime();
        StringBuilder stringBuilder3 = new StringBuilder("Sbd");
        System.out.print(stringBuilder3 + " ");
        long endTime5 = System.nanoTime();
        System.out.println(endTime5 - startTime5);
        long startTime4 = System.nanoTime();
        StringBuffer stringBuffer3 = new StringBuffer("Sbf");
        System.out.print(stringBuffer3 + " ");
        long endTime4 = System.nanoTime();
        System.out.println(endTime4 - startTime4);

        System.out.println("\n-----------------------------\n92. Write a Java program to count the number of even and odd elements in a given array of integers\n");
        int ninetySecondInt = 0;
        for (int i = 1; i <= 100; i++) {
            if (i%2==0) {
                ninetySecondInt++;
            }
        }
        System.out.println("Even values in arrays: " + ninetySecondInt);
        System.out.println("Odd values in arrays: " + (100-ninetySecondInt));

        System.out.println("\n-----------------------------\n93. Write a Java program to test if an array of integers contains an element 10 next to 10 or an element 20 next to 20, but not both\n");

        int[] ninetyThirdArrays = {10,12,20,13,20,10,10,23,21,12};
        int ninetyThirdNum = 0;
        for (int i = 0; i < ninetyThirdArrays.length; i++) {
            System.out.println(ninetyThirdArrays[i]);
            ninetyThirdNum = ninetyThirdArrays[i];
        }

    }
}
