package fifthWeek;

public class Main {
    public static void main(String[] args) {

//        System.out.println(cigarParty(39, true));
        System.out.println(dateFashion(5,10));
    }
    public static boolean cigarParty(int cigars, boolean isWeekend) {
        return (isWeekend==true)&& cigars>=40 || (cigars>=40&&cigars<=60);
    }


    public static int dateFashion(int you, int date) {
        return you<8 && date<8 && you>2 && date>2?1:date<=2 || you<=2?0:2;
    }

}

