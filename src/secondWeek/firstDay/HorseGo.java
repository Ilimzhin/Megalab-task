package secondWeek.firstDay;

import java.util.Scanner;

public class HorseGo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("X координата коня от 1 до 8");
        int xHorse = sc.nextInt();
        System.out.println("Y координата коня от 1 до 8");
        int yHorse = sc.nextInt();
        System.out.println("X координата др фигуры от 1 до 8");
        int xOtherFigure = sc.nextInt();
        System.out.println("Y координата др фигуры от 1 до 8");
        int yOtherFigure = sc.nextInt();

        if (xHorse-xOtherFigure==2 || xHorse-xOtherFigure==-2) {
            if (yHorse-yOtherFigure==1 || yHorse-yOtherFigure==-1) {
                System.out.println("конь бьет фигуру");
            }
        } else if(yHorse-yOtherFigure==2 || yHorse-yOtherFigure==-2) {
            if (xHorse-xOtherFigure==1 || xHorse-xOtherFigure==-1) {
                System.out.println("Конь бьет фигуру");
            }
        } else {
            System.out.println("Конь не бьет фигуру");
        }



    }

}
