package thirdWeek.secondDay.oop;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Rocket rock = new Rocket();
        Rocket rocket = new Rocket("SpaceX", 100, "Raptor", 57815.25, true, new String[]{"Mark", "Steve", "Kevin"});
        System.out.println(rocket);
        rock.update(rocket,"RD-18");
        System.out.println(rocket);

        Rocket rocket1 = new Rocket();
        rocket1.manufacturer = "CoverSgi";
        rocket1.speed = 2000;


        Rocket[] rockets = {rocket, rocket1};
        rock.fly(rocket1);
//        for(Rocket r: rockets) {
////            r.fly();
//            System.out.println();
//            r.fly(rocket1);
//        }

//        System.out.println(Arrays.toString(rockets));


    }
}
