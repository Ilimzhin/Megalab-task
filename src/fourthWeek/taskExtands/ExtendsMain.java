package fourthWeek.taskExtands;

import java.util.HashMap;
import java.util.Map;

public class ExtendsMain {
    public static void main(String[] args) {

        Specialist specialist1 = new Specialist("Maksatbek", "Maksatbek", 25000, 19, 3);
        Specialist specialist2 = new Specialist("Nuraly", "Nursultanov", 80000, 20, 2);
        Specialist specialist3 = new Specialist("Aibek", "Aibekov", 35000, 21, 3);

        Developer developer1 = new Developer("Ivan", "Ivanov", 130000, 27, "Middle");
        Developer developer2 = new Developer("Aleksandr", "Aleksandrov", 70000, 25, "Middle");
        Developer developer3 = new Developer("Adilet", "Adiletov", 55000, 32, "Middle");
        Developer developer4 = new Developer("Alinur", "Alinurov", 65000, 30, "Middle");

        Manager manager1 = new Manager("Saimon", "Saimanov", 200000, 38, true);
        Manager manager2 = new Manager("Tilek", "Tilekov", 180000, 39, false);

        CEO ceo = new CEO("Adakhan", "Bolotbekov", 150000, 34, true, true);

        Employee[] empls = {specialist1, specialist2, specialist3,developer1, developer2, developer3, developer4,manager1, manager2, ceo};
        for (Employee employee: empls) {
            employee.whatAmIDoing();
        }

    }
}
