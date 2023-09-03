package fourthWeek.cars.com.company.professions;

import fourthWeek.cars.com.company.details.Person;

public class Driver extends Person {

    private String experience;

    public Driver(String name, int age, String experience) {
        super(name, age);
        this.experience = experience;
    }

    public Driver() {
    }

    @Override
    public String toString() {
        return "Driver{" +"Person{" +
                "Имя: " + getName() + ", Возраст: " + getAge() +
                "'}'" +
                "experience='" + experience + '\'' +
                '}';
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

}
