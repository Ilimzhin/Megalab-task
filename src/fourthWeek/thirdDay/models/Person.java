package fourthWeek.thirdDay.models;

public class Person {
    
    private String name;
    private int age;

    public String displayInfo() {
        return "Имя: " + name + "\nВозраст: " + age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
