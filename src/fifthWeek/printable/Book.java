package fifthWeek.printable;

public class Book extends PrintableEntity implements Printable {
    private String authorName;
    private int amountPages;
    @Override
    public void print() {
        System.out.printf("Name book -> %s, with author %s, books have %d pages\n",getName(),authorName,amountPages);
    }

    public Book(String name, String authorName, int amountPages) {
        super(name);
        this.authorName = authorName;
        this.amountPages = amountPages;
    }

    public String getAuthorName() {
        return authorName;
    }
    public static void printBook(Printable[] printable) {
        for (Printable value : printable) {
            if (value instanceof Book) {
                value.print();
            }

        }
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getAmountPages() {
        return amountPages;
    }

    public void setAmountPages(int amountPages) {
        this.amountPages = amountPages;
    }
}
