package fourthWeek;

import fourthWeek.models.Guitar;
import fourthWeek.secondDay.Car;
import fourthWeek.secondDay.HatchBack;
import fourthWeek.secondDay.SportCar;
import fourthWeek.secondDay.Universal;

public class Main {

    public static void main(String[] args) {
        Guitar guitar = new Guitar("brown",6);
        guitar.tune(guitar.getStringCount());
        System.out.println(guitar);
        guitar.play();
        System.out.println(guitar);

        SportCar sportCar = new SportCar("Zonda","Pagani","2020");
        System.out.println(sportCar);
        Universal universal = new Universal("Odyssey", "Honda", "2005", 7);
        System.out.println(universal.getSeatCount());

        Car car = new HatchBack("Fit","Honda","2003", 5);
        car.toDisplay();

    }

}
