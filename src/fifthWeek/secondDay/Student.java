package fifthWeek.secondDay;

import fifthWeek.secondDay.service.StudentService;

public class Student extends Person implements StudentService {
    private String course;

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public void goTO(String destination) {
        System.out.println("I am going to " + destination);
    }

    public Student(String name, String course) {
        super(name);
        this.course = course;
    }

    public Student() {
    }

}
