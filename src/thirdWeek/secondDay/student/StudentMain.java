package thirdWeek.secondDay.student;

import java.util.Arrays;

public class StudentMain {

    public static void main(String[] args) {
        Student student1 = new Student("Adam","Sendler", 5, new int[] {5,4,3,3,5});
        Student student2 = new Student("Baya","Begishev", 8, new int[] {4,4,4,4,4});
        Student student3 = new Student("Vladislav","Voinov", 9, new int[] {2,3,4,2,3});
        Student student4 = new Student("Guzyal","Guzratova", 2, new int[] {5,4,3,3,5});
        Student student5 = new Student("David","Davidov", 4, new int[] {5,5,5,5,5});
        Student student6 = new Student("Evgenii","Eryshev", 1, new int[] {3,3,3,3,3});
        Student student7 = new Student("Zukhra","Zaitov", 2, new int[] {2,2,2,3,2});
        Student student8 = new Student("Ivan","Ivanov", 5, new int[] {5,4,3,3,5});
        Student student9 = new Student("Kevin","Kaldinov", 5, new int[] {4,4,4,4,4});
        Student student10 = new Student("Ramos","Serhio", 5, new int[] {3,3,3,3,3});

        Student[] students = new Student[]{student1, student2, student3, student4,
                student5, student6, student7, student8, student9, student10, };

        System.out.println(Arrays.toString(students));
    }

}
