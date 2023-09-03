package fourthWeek.thirdDay.models;

public class Driver extends Person{
    private int stage;

    @Override
    public String displayInfo() {
        return super.displayInfo() + "\nВозраст:" +stage;
    }

    public Driver() {
    }

    public Driver(String name, int age, int stage) {
        super(name, age);
        this.stage = stage;
    }
}
