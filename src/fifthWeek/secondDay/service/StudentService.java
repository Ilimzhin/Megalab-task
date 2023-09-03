package fifthWeek.secondDay.service;

import fifthWeek.secondDay.Student;

public interface StudentService {
    String NAME = "DAVID";

    default void study(Student student) {
        System.out.println("this is default implementation with name: " + NAME);
    }

}
