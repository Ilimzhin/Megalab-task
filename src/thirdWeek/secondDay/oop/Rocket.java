package thirdWeek.secondDay.oop;

import java.util.Arrays;

public class Rocket {
    String[] crew;
    String manufacturer;
    int speed;
    String engine;
    double weight;
    boolean isAutopilot;

    public Rocket() {
    }

    public Rocket(String manufacturer, int speed, String engine, double weight, boolean isAutopilot, String [] crew) {
        this.manufacturer = manufacturer;
        this.speed = speed;
        this.engine = engine;
        this.weight = weight;
        this.isAutopilot = isAutopilot;
        this.crew = crew;
    }

    @Override
    public String toString() {
        return "\nRocket: " +
                "\nmanufacturer: " + manufacturer +
                ",\nspeed: " + speed +
                ",\nengine: " + engine +
                ",\nweight=" + weight +
                ",\nisAutopilot=" + isAutopilot + Arrays.toString(crew).substring(1,Arrays.toString(crew).length()-1);
    }

    void fly() {
        System.out.printf("Ракета компании %s летит в космос со скоростью %d", manufacturer, speed);
    }
    void fly(Rocket rocket) {
        System.out.printf("Ракета компании %s летит в космос со скоростью %d", rocket.manufacturer, rocket.speed);
    }
//    void rocket(manufacturer,speed) {
//        System.out.println("Ракета компании %s летит в космос со скоростью %d", manufacturer, speed);
//    }
    Rocket update(Rocket rocket, String rocketEngine) {
        rocket.engine=rocketEngine;
        return rocket;
    }

}
