package fourthWeek.animal;

public class Dog extends Animal {

    private String nickName;

    public Dog() {

    }

    public Dog(String food, String location, String nickName) {
        super(food, location);
        this.nickName = nickName;
        eat();
        makeNoise();
        sleep();
    }


    @Override
    public void makeNoise() {
        System.out.println("Собака лает ГАВ! ");
    }

    @Override
    public void eat() {
        System.out.println("Собака ест ");
    }
    @Override
    public void sleep() {
        System.out.println("Собака не спит");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "nickName='" + nickName +
                '}';
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

}
