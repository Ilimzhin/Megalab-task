package fourthWeek.cars.com.company.vehicles;

import fourthWeek.cars.com.company.details.Engine;
import fourthWeek.cars.com.company.professions.Driver;

public class Lorry extends Car{

    private int carryingCapacity; //грузоподъемность

    public Lorry(String brand, String classCar, int weight, Engine engine, Driver driver, int carryingCapacity) {
        super(brand, classCar, weight, engine, driver);
        this.carryingCapacity = carryingCapacity;
        System.out.print(getBrand() + ": ");
        turnLeft();
        System.out.print("потом: ");
        stop();
    }

    @Override
    public String toString() {
        return "Lorry{" + "brand='" + getBrand() + '\'' +
                ", classCar='" + getClassCar() + '\'' +
                ", weight=" + getWeight() +
                ", engine=" + engine +
                ", driver=" + driver +
                ", carryingCapacity=" + carryingCapacity +
                '}';
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }
}
