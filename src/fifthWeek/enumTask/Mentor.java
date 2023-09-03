package fifthWeek.enumTask;

import fifthWeek.enumTask.enums.Degree;
import fifthWeek.enumTask.enums.Pl;

public class Mentor extends Person{
    private Degree degree;


    public Mentor(String fullName, Pl pl, int age, boolean gender, Degree degree) {
        super(fullName, pl, age, gender);
        this.degree = degree;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return super.toString() + "  ->  Mentor{" +
                "degree=" + degree +
                '}';
    }
}
