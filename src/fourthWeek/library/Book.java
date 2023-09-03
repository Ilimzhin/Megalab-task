package fourthWeek.library;

public class Book {

    private String nameBook;
    private String authorBook;

    public Book(String nameBook, String authorBook) {
        this.nameBook = nameBook;
        this.authorBook = authorBook;
    }

    public Book(String nameBook) {
        this.nameBook = nameBook;
    }

    public Book() {
    }


    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                ", authorBook='" + authorBook + '\'' +
                '}';
    }

    public String getAuthorBook() {
        return authorBook;
    }

    public void setAuthorBook(String authorBook) {
        this.authorBook = authorBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

}
