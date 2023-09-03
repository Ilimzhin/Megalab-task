package fourthWeek.animal;

public abstract class Animal {
    private String food;
    private String location;


    public Animal() {
    }

    public Animal(String food, String location) {
        System.out.println("\nЕда животного: " + food);
            System.out.println("Локация животного: " + location);
    }

    public abstract void makeNoise();

    public abstract void eat();

    public abstract void sleep();


    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
