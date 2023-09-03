package secondWeek.secondDay;

public class taskForFor {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print("Ilimzhin |");
        }
        System.out.println();
        for (int i = 0; i < 100; i++) {
            System.out.print(i + ", ");
        }
        System.out.println();
        for (int i = 1; i < 101; i++) {
            if (i%2==0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
        for (int i = 0; i < 100; i++) {
            if (i%4==0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
    }

}
