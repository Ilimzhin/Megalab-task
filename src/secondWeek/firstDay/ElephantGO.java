package secondWeek.firstDay;

import java.util.Scanner;

public class ElephantGO {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("X координата слона от 1 до 8");
        int xElephant = sc.nextInt();
        System.out.println("Y координата слона от 1 до 8");
        int yElephant = sc.nextInt();
        System.out.println("X координата др фигуры от 1 до 8");
        int xOtherFigure = sc.nextInt();
        System.out.println("Y координата др фигуры от 1 до 8");
        int yOtherFigure = sc.nextInt();

        if (xElephant-xOtherFigure==yElephant-yOtherFigure) {
            System.out.println("Слон бьет фигуру");
        } else if (xElephant - xOtherFigure == -1 * (yElephant - yOtherFigure)) {
            System.out.println("Слон бьет фигуру");
        } else if (-1*(xElephant - xOtherFigure) == yElephant - yOtherFigure) {
            System.out.println("Слон бьет фигуру");
        } else if (-1*(xElephant - xOtherFigure) == -1 * (yElephant - yOtherFigure)) {
            System.out.println("Слон бьет фигуру");
        } else {
            System.out.println("Слон не бьет фигуру");
        }

    }
}
