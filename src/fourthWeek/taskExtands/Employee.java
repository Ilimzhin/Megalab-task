package fourthWeek.taskExtands;

import java.util.Collection;

public class Employee {

    private String firstName;
    private String lastName;
    private int salary;
    private int age;

    public Employee() {
    }

    public Employee(String firstName, String lastName, int salary, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.age = age;
    }
    public void whatAmIDoing() {
        System.out.println(firstName);
    }

    public void print() {
        System.out.print( "Employee " +
                "firstName: " + firstName +
                ", lastName: " + lastName +
                ", salary: " + salary +
                ", age: " + age + "  ::  ");

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
