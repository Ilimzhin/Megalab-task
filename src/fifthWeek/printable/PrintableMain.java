package fifthWeek.printable;

public class PrintableMain {

    public static void main(String[] args) {

        Book book1 = new Book("A Little Prince", "Exepury", 80);
        Book book2 = new Book("B books", "Emir", 120);
        Book book3 = new Book("C books", "Maks", 100);
        Magazine magazine1 = new Magazine("Bishkek","Смог", 5);
        Magazine magazine2 = new Magazine("КГМА-news","Повышение зп В KFC", 12);
        Magazine magazine3 = new Magazine("Kant-news","Сложность добираться до курсов", 3);
        Printable[] printable = {book1,book2,book3, magazine1, magazine2, magazine3};

        Magazine.printMagazines(printable);
        Book.printBook(printable);
    }
}
