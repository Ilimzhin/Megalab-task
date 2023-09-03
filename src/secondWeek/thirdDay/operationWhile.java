package secondWeek.thirdDay;


public class operationWhile {
    public static void main(String[] args) {
        int counter = 0;
        while (counter<10) {
            counter++;
            if (counter==4) {
                continue;
            }
            System.out.println(counter);
        }
    }
}
