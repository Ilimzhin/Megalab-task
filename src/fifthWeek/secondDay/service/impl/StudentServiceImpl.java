package fifthWeek.secondDay.service.impl;

import fifthWeek.secondDay.Student;
import fifthWeek.secondDay.service.StudentService;

public class StudentServiceImpl implements StudentService {
    @Override
    public void study(Student student) {
        System.out.printf("%s is a student of KRSU learn %s it is %s", student.getName(),student.getCourse(), backOrFront(student));
    }

    private String backOrFront(Student student) {
        return student.getCourse().equals("Java")|| student.getCourse().equals("Python")?"BackEnd": "FrontEnd";
    }
}
