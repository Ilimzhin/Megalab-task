package secondWeek.fifthDay;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.stream.DoubleStream;

public class RandomArray {
    public static void main(String[] args) {
        double[] doubleArray = new double[20];
        double sum = 0;
        for (int i = 0; i < doubleArray.length; i++) {
            doubleArray[i] = Math.random();
            sum+=doubleArray[i];

        }


        int num1 = 0;
        for (double array :doubleArray) {
            num1++;
            System.out.println(num1 + " " + String.format("%.2f", array));
        }
        Arrays.sort(doubleArray);
        System.out.println("Минимальное значение : " + String.format("%.2f", ((doubleArray[0]))));
        System.out.println("среднее значение : " + String.format("%.2f", (sum/20)));
        System.out.println("Максимальное значение: " + String.format("%.2f", ((doubleArray[doubleArray.length-1]))));

    }
}
