package fourthWeek.taskExtands;

public class Manager extends Employee{

    private boolean hasStocks;

    public void writeProcedures() {
        System.out.print("У меня есть акции которыми я распоряжаюсь");
    }

    public Manager() {

    }
    public Manager(String firstName, String lastName, int salary, int age, boolean hasStocks) {
        super(firstName, lastName, salary, age);
        this.hasStocks = hasStocks;
    }
    @Override
    public void whatAmIDoing() {
        print();
        System.out.printf("my levels %b",isHasStocks());
        writeProcedures();
        System.out.println();
    }

    public boolean isHasStocks() {
        return hasStocks;
    }

    public void setHasStocks(boolean hasStocks) {
        this.hasStocks = hasStocks;
    }
}
