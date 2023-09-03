package fourthWeek.taskExtands;

public class CEO extends Manager{

    private boolean hasCompanyCar;

    public void goPublic() {
        System.out.print("|Now i working with CEO");
    }

    public CEO() {
    }

    public CEO(String firstName, String lastName, int salary, int age, boolean hasStocks, boolean hasCompanyCar) {
        super(firstName, lastName, salary, age, hasStocks);
        this.hasCompanyCar = hasCompanyCar;
    }
    @Override
    public void whatAmIDoing() {
        print();
        System.out.printf("Have i share: %b, Have i a company car: %b",isHasStocks(), isHasCompanyCar());
        goPublic();
        System.out.println();
    }

    public boolean isHasCompanyCar() {
        return hasCompanyCar;
    }

    public void setHasCompanyCar(boolean hasCompanyCar) {
        this.hasCompanyCar = hasCompanyCar;
    }
}
