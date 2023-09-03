package fourthWeek.animal;

public class AnimalMain {

    public static void main(String[] args) {
        Veterinary veterinary = new Veterinary();

        Animal[] animals = {
                new Dog("bone","outdoors","Bobik"),
                new Cat("fish","home","brown with white lines"),
                new Horse("Grass","stable",70)
        };
        for (Animal animal: animals) {
            System.out.println();
            veterinary.treatAnimal(animal);
        }
    }

}
