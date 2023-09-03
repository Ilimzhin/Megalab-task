package secondWeek.secondDay;

public class ExOne {
    public static void main(String[] args) {

        String name = "Collector";
        System.out.println(name);

        for (int i = 0; i < name.length(); i++) {
            System.out.printf("-_-%s_-_", name.toUpperCase().charAt(i));
        }

//        for (int i = 1; i < 10; i++) {
//            for (int j = 1; j < 10; j++) {
//                System.out.printf(" %d + %d = %d   ||", j,i,j*i);
//            }
//            System.out.println();
//        }



    }
}

