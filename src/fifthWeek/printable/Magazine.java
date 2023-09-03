package fifthWeek.printable;

public class Magazine extends PrintableEntity implements Printable{

    private String themesJournal;
    private int amountDayBefore;
    @Override
    public void print() {
        System.out.printf("Name journal -> %s, with themes %s, journal made %d days age\n",getName(),themesJournal,amountDayBefore);
    }

    public Magazine(String name, String themesJournal, int amountDayBefore) {
        super(name);
        this.themesJournal = themesJournal;
        this.amountDayBefore = amountDayBefore;
    }

    public static void printMagazines(Printable[] printable) {
        for (Printable value : printable) {
            if (value instanceof Magazine) {
                    value.print();
            }

        }
    }

    public String getThemesJournal() {
        return themesJournal;
    }

    public void setThemesJournal(String themesJournal) {
        this.themesJournal = themesJournal;
    }

    public int getAmountDayBefore() {
        return amountDayBefore;
    }

    public void setAmountDayBefore(int amountDayBefore) {
        this.amountDayBefore = amountDayBefore;
    }
}
