package fifthWeek.enumTask;

import fifthWeek.enumTask.enums.Pl;

public abstract class Person {

    private String fullName;
    private Pl pl;
    private int age;
    private boolean gender;

    public Person(String fullName, Pl pl, int age, boolean gender) {
        this.fullName = fullName;
        this.pl = pl;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", pl=" + pl +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public Pl getPl() {
        return pl;
    }

    public void setPl(Pl pl) {
        this.pl = pl;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
