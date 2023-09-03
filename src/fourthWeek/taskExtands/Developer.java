package fourthWeek.taskExtands;

public class Developer extends Employee{

    private String grades;

    public void writeCode() {
        System.out.print("| Silence please i'm coding..");
    }
    public Developer() {

    }
    public Developer(String firstName, String lastName, int salary, int age, String grades) {
        super(firstName, lastName, salary, age);
        this.grades = grades;
    }
    @Override
    public void whatAmIDoing() {
        print();
        System.out.printf("my levels %s",getGrades());
        writeCode();
        System.out.println();

    }

    public String getGrades() {
        return grades;
    }

    public void setGrades(String grades) {
        this.grades = grades;
    }
}
