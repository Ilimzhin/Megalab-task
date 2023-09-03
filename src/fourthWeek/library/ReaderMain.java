package fourthWeek.library;

import java.time.LocalDate;

public class ReaderMain {

    public static void main(String[] args) {
        LocalDate birthDay = LocalDate.of(1986, 3, 12);
//        System.out.println(birthDay.getMonth());

        Reader readerName1 = new Reader("Петров В. В.",12321,"inform",birthDay, 433032);
        System.out.println(readerName1);
        System.out.println("------------------------");
        readerName1.takeBook(readerName1.getFullName(), 3);
        readerName1.takeBook(readerName1.getFullName(),new String[] {"Приключение", "Словарь", "Энциклопедия"});
        readerName1.returnBook(readerName1.getFullName(),3);
        readerName1.returnBook(readerName1.getFullName(),new String[] {"Приключение", "Словарь", "Энциклопедия"});

    }

}
