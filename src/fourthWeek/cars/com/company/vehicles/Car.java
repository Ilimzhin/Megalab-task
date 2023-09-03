package fourthWeek.cars.com.company.vehicles;

import fourthWeek.cars.com.company.details.Engine;
import fourthWeek.cars.com.company.professions.Driver;

public class Car {

    private String brand;
    private String classCar;
    private int weight;

    Engine engine = new Engine();
    Driver driver = new Driver();

    public Car(String brand, String classCar, int weight) {
        this.brand = brand;
        this.classCar = classCar;
        this.weight = weight;
    }

    public Car(String brand, String classCar, int weight, Engine engine, Driver driver) {
        this.brand = brand;
        this.classCar = classCar;
        this.weight = weight;
        this.engine = engine;
        this.driver = driver;
    }

    public void start() {
        System.out.println("Едет");
    }
    public void stop() {
        System.out.println("Останавливается");
    }
    public void turnRight() {
        System.out.println("поварачивает направо");
    }
    public void turnLeft() {
        System.out.println("поварачивает налево");
    }
    //start()stop(), turnRight()turnLeft() которые выводят на печать: "Поехали", "Останавливаемся", "Поворот направо" или "Поворот налево"

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getClassCar() {
        return classCar;
    }

    public void setClassCar(String classCar) {
        this.classCar = classCar;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", classCar='" + classCar + '\'' +
                ", weight=" + weight +
                ", engine=" + engine +
                ", driver=" + driver +
                '}';
    }
}
