package thirdWeek.thirdDay;

public class ThirdDayMain {

    public static void main(String[] args) {
        ThirdDayMethods th = new ThirdDayMethods();
        Calculate calculate = new Calculate();
        System.out.println("Первый");
        th.minValue(7, 3);
        System.out.println("Второй");
        th.quadrateValue(5);
        System.out.println("Третий");
        th.cubeValue(5);
        System.out.println("Четвертый");
        th.valueInDegree(2, 3);
        System.out.println("Пятый");
        th.moreLessValue(5);
        System.out.println("Шестой");
        th.dayOfTheWeek(7);

        System.out.println("Calculate");
        int num1 = calculate.getInt();
        char operators = calculate.getOperation();
        int num2 = calculate.getInt();
        calculate.calc(num1, operators, num2);

    }

}
