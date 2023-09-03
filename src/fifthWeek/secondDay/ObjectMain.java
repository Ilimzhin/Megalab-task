package fifthWeek.secondDay;

import fifthWeek.secondDay.service.impl.StudentServiceImpl;

public class ObjectMain {

    public static void main(String[] args) {

        Person person = new Student();

//        person.goTO("Work");
        Student student = new Student("Max","Java");
        StudentServiceImpl service = new StudentServiceImpl();
        service.study(student);
        System.out.println();
        student.study(student);
    }
}
