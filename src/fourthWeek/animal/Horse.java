package fourthWeek.animal;

public class Horse extends Animal{

    private int speed;

    public Horse(String food, String location, int speed) {
        super(food, location);
        this.speed = speed;
        eat();
        makeNoise();
        sleep();
    }


    @Override
    public void makeNoise() {
        System.out.println("Horse is LMAOO");
    }

    @Override
    public void eat() {
        System.out.println("Horse eat ");
    }

    @Override
    public void sleep() {
        System.out.println("Horse is sleeping");
    }

    @Override
    public String toString() {
        return "Horse{" +
                "speed=" + speed +
                "km/h}";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
