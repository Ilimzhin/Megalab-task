package secondWeek.fifthDay;

import java.util.Objects;
import java.util.Scanner;

public class TaskForArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        boolean isActive = true;
        String[] array = new String[10];
        int nullAr = 0;
        for (int i = 0; i < array.length;) {

//            System.out.println(i);
            System.out.println("Хотите продолжить: y/n");
            String continueCodeQuestion = sc.next();
            if(continueCodeQuestion.equalsIgnoreCase("n")) {
                System.out.println("Вы закончили с введением городов");
                break;
            } else if(continueCodeQuestion.equalsIgnoreCase("y")) {
                System.out.println("Введите название города");
                String nameCountry = sc.next();
                System.out.println("Вы успешно добавили город : " + nameCountry);
                array[i] = nameCountry;
                i++;
                nullAr = i;
            } else {
                System.out.println("Вы не ввели y/n");
            }

        }

        int numCountry=1;
        for (String arrays: array) {
            if (arrays!=null ) {
                System.out.println(numCountry+ " : " + arrays);
            }
            numCountry++;
        }
        int res = 10-nullAr;
        System.out.println("Количество пустых ячеек = " + res );

        for (int i = 0; i < array.length;) {

//            System.out.println(i);
            System.out.println("Хотите продолжить для удаления: y/n");
            String continueCodeQuestion2 = sc.next();
            if (continueCodeQuestion2.equalsIgnoreCase("n")) {
                System.out.println("Вы закончили с удалением городов");
                break;
            } else if (continueCodeQuestion2.equalsIgnoreCase("y")) {
                System.out.println("Введите название города которую хотите удалить");
                String nameCountryForDelete = sc.next();
                for (int j = 0; j < array.length; j++) {
                    if (nameCountryForDelete.equalsIgnoreCase(array[j])) {
                        array[j] = null;
                        System.out.println("Вы удалили город : " + nameCountryForDelete);
                        break;
                    }
//                        System.out.println("Такого города нет!");
                }

            } else {
                System.out.println("Вы не ввели y/n");
            }
            int numCountry1 = 0;
            for (String endCities : array) {
                if (endCities!=null ) {
                    System.out.println(numCountry1 + " : " + endCities);
                }
                numCountry1++;
            }
        }
        int numCountries = 0;
//        int numCountries1 =0;
        for (String arrays1: array) {
            if (arrays1!=null) {
                System.out.println(numCountries + " : " + arrays1);
                numCountries++;
            }
        }
        System.out.println("Количество пустых ячеек: " + (10-numCountries));




    }
}
