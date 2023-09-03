package fifthWeek.enumTask;

import fifthWeek.enumTask.enums.Degree;
import fifthWeek.enumTask.enums.Payment;
import fifthWeek.enumTask.enums.Pl;

import java.util.Arrays;

public class EnumTaskMain {

    public static void main(String[] args) {

        Student student1 = new Student("Maks", Pl.PYTHON,19,true, Payment.FREE);
        Student student2 = new Student("Emir", Pl.JAVA,19,true, Payment.HALFPAYED);
        Student student3 = new Student("Roman", Pl.FLUTTER,19,true, Payment.NOTPAYED);

        Mentor mentor1 = new Mentor("Iskandar",Pl.JAVA,30,true, Degree.MIDDLE);
        Mentor mentor2 = new Mentor("Dmitrii",Pl.JAVA,30,false, Degree.INTERN);
        Mentor mentor3 = new Mentor("Vlad",Pl.JAVA,28,true, Degree.SENIOR);
        Person[] person = {student1,student2,student3,mentor1,mentor2,mentor3};

        for (Person persons: person) {
            System.out.println(persons);
        }

        System.out.println();
        System.out.println(Arrays.toString(Pl.values()));
        System.out.println(Arrays.toString(Degree.values()));
        System.out.println(Arrays.toString(Payment.values()));
        System.out.println();
        System.out.println(Pl.JAVA.name());
        System.out.println(Degree.JUNIOR.name());
        System.out.println(Payment.DELETED.name());

    }
}
