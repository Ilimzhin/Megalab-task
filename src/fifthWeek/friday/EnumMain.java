package fifthWeek.friday;


import fifthWeek.friday.enums.Season;
import fifthWeek.friday.models.Student;

import java.util.Arrays;

public class EnumMain {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Season.values()));
        Student frankie = new Student("Frankie", Season.SUMMER,"Java");
        System.out.println(frankie);
        Season.WINTER.tellAboutSeason();

    }
}
