package thirdWeek;

public class StringBuilderMain {

    public static void main(String[] args) {
        String stringName = "David";
        StringBuilder sbdName = new StringBuilder("David");
        StringBuffer sbfName = new StringBuffer("David");
        System.out.println(stringName.equals(sbdName.toString()));
        System.out.println(sbfName.equals(stringName));

        long start = System.nanoTime();
        sCnct(stringName);
        long end = System.nanoTime();
        System.out.println("time to String concat: " + (end-start));
        System.out.println("---------");
    }

    public static void sCnct(String name) {
        for (int i = 0; i < Short.MAX_VALUE; i++) {
            name+=i;
        }
    }
    public static void sbdCnct(String sbdName) {
        for (int i = 0; i < Short.MAX_VALUE; i++) {
            sbdName+=i;
        }
    }
    public static void sbfCnct(String sbfName) {
        for (int i = 0; i < Short.MAX_VALUE; i++) {
            sbfName+=i;
        }
    }

}
