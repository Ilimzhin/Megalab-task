package thirdWeek.secondDay.student;

import java.util.Arrays;

public class Student {

    String firstname;
    String lastname;
    int numGroup;
    int[] rating;

    @Override
    public String toString() {
        return "\n\nStudent: " +
                "\nfirstname: " + firstname +
                "\nlastname: " + lastname +
                "\nnumGroup: " + numGroup +
                "\nrating: " + Arrays.toString(rating);
    }

    public Student(String firstname, String lastname, int numGroup, int[] rating) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.numGroup = numGroup;
        this.rating = rating;
    }
}
