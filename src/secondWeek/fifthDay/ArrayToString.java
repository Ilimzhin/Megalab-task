package secondWeek.fifthDay;

import java.util.Arrays;

public class ArrayToString {
    public static void main(String[] args) {
        String[] colors = {"Green", "Red", "Brown", "Black", "White", "Pink"};
        String res = Arrays.toString(colors);
        System.out.println(res);

        for (String color: colors) {
            if (color.equalsIgnoreCase("Pink")) {
                System.out.print(color + ".");
            } else {
                System.out.print(color + ", ");
            }
        }
    }
}
