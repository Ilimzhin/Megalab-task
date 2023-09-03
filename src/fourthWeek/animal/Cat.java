package fourthWeek.animal;

public class Cat extends Animal {
    private String hair;

    public Cat(String food, String location, String hair) {
        super(food, location);
        this.hair = hair;
        eat();
        makeNoise();
        sleep();
    }

    @Override
    public void makeNoise() {
        System.out.println("Cat say Myauuuu");
    }

    @Override
    public void eat() {
        System.out.println("cat eat ");
    }

    @Override
    public void sleep() {
        System.out.println("cat is sleeping");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "hair='" + hair + '\'' +
                '}';
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

}
