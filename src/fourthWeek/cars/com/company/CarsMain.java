package fourthWeek.cars.com.company;

import fourthWeek.cars.com.company.details.Engine;
import fourthWeek.cars.com.company.professions.Driver;
import fourthWeek.cars.com.company.vehicles.Car;
import fourthWeek.cars.com.company.vehicles.Lorry;
import fourthWeek.cars.com.company.vehicles.SportCar;

public class CarsMain {

    public static void main(String[] args) {
        System.out.println("ssout" + 20+22);
        Car car = new Car("BMW", "Business", 1000,new Engine("100 лошадинных сил","50%"),new Driver("Ilim", 23,"5 years"));
        Car car2 = new Lorry("MAN", "GRUZOVIk", 1000,new Engine("20 лошадинных сил","30%"),new Driver("Asusta",25 ,"12 years"),3500);
        Car car3 = new SportCar("Toyota", "Elite", 1000,new Engine("150 лошадинных сил","20%"),new Driver("Aza",28, "8 years"),300);
        System.out.println(car);
        System.out.println(car2);
        System.out.println(car3);

    }

}
