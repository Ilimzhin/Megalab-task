package fourthWeek.thirdDay;

import fourthWeek.thirdDay.models.Driver;
import fourthWeek.thirdDay.models.Person;

public class Main {

    public static void main(String[] args) {
        Driver driver = new Driver("David", 45, 5);
        Person person =driver;
        System.out.println(person.displayInfo());
        Person person1 = new Person("Colin", 34);
        System.out.println(person1.displayInfo());
    }
}
