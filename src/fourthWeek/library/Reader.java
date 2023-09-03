package fourthWeek.library;

import java.time.LocalDate;
import java.util.Arrays;

public class Reader extends Book{

    private String fullName;
    private int numberReaderTicket;
    private String faculty;
    private LocalDate birthday;
    private int numberPhone;

//    Book book1 = new Book("Приключение");
//    Book book2 = new Book("Словарь");
//    Book book3 = new Book("Энциклопедия");
//    private Book[] books = {book1, book2, book3};


    public Reader() {
    }
    public void takeBook(String fullName, String[] books) {
        System.out.print( fullName + " взял книги: ");
        for (String book: books) {
            System.out.print(book + ", ");
        }
        System.out.println();
    }
    public void takeBook(String fullName, int count) {

        System.out.println(fullName + " взял " + count + " книги");
    }
    public void returnBook(String fullName, String[] books) {
        System.out.print( fullName + " вернул книги: ");
        for (String book: books) {
            System.out.print(book + ", ");
        }
        System.out.println();
    }
    public void returnBook(String fullName, int count) {

        System.out.println(fullName + " вернул " + count + " книги");
    }


    public Reader(String fullName, int numberReaderTicket, String faculty, LocalDate birthday, int numberPhone) {
        this.fullName = fullName;
        this.numberReaderTicket = numberReaderTicket;
        this.faculty = faculty;
        this.birthday = birthday;
        this.numberPhone = numberPhone;
    }


    @Override
    public String toString() {
        return "Пользователь библиотеки:" +
                "\nФИО: " + fullName +
                "\nНомер читательского билета: " + numberReaderTicket +
                "\nФакультет: " + faculty + '\'' +
                "\nНомер телефона: " + birthday +
                "\nНомер телефона: " + numberPhone ;
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getNumberReaderTicket() {
        return numberReaderTicket;
    }

    public void setNumberReaderTicket(int numberReaderTicket) {
        this.numberReaderTicket = numberReaderTicket;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }
}
