package fifthWeek.friday.models;

import fifthWeek.friday.enums.Season;

public class Student extends Person{


    private String course;

    public Student(String name, Season season, String course) {
        super(name, season);
        this.course = course;
    }

    @Override
    public String toString() {
        return super.toString()+"\nCourse: " + course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
