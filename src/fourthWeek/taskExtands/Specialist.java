package fourthWeek.taskExtands;

public class Specialist extends Employee{

    private int levels;

    public void workWithClients() {
        System.out.print("| Now I talk with clients");
    }

    public Specialist(String firstName, String lastName, int salary, int age, int levels) {
        super(firstName, lastName, salary, age);
        this.levels = levels;
    }

    public Specialist() {
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }

    @Override
    public void whatAmIDoing() {
        print();
        System.out.printf("my levels %d", getLevels());
        workWithClients();
        System.out.println();
    }
}
