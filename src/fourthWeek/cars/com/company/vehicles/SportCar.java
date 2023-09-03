package fourthWeek.cars.com.company.vehicles;

import fourthWeek.cars.com.company.details.Engine;
import fourthWeek.cars.com.company.professions.Driver;

public class SportCar extends Car{
    private int maxSpeed;

    public SportCar(String brand, String classCar, int weight, Engine engine, Driver driver, int maxSpeed) {
        super(brand, classCar, weight, engine, driver);
        this.maxSpeed = maxSpeed;
        System.out.print(getBrand() + ": ");
        start();
        System.out.print("затем: ");
        turnRight();
    }

    @Override
    public String toString() {
        return "SportCar{" + "brand='" + getBrand() + '\'' +
                ", classCar='" + getClassCar() + '\'' +
                ", weight=" + getWeight() +
                ", engine=" + engine +
                ", driver=" + driver +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
