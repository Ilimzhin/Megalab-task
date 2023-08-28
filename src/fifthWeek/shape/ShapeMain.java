package fifthWeek.shape;

public class ShapeMain {
    public static void main(String[] args) {
        rectangleTestShit(20,7);
        System.out.println("\n\n\n\n\n");
        Shape rectangle1 = new Rectangle("yellow",14,4);
        Shape circle1 = new Circle("Black", 12);
        System.out.println(rectangle1);
        System.out.println(circle1);

//        Shape[] shapes = {circle1,rectangle1,circle2};
//        for (Shape shape: shapes) {
//            System.out.println(shape);
//        }

    }
    static public void rectangleTestShit(int dlina, int shirina) {
        for (int i = 0; i <= dlina+1; i++) {
            System.out.print("*  ");
        }
        System.out.println();
        for (int i = 0; i < shirina; i++) {
            System.out.print("*");
            for (int j = 0; j < dlina; j++) {
                System.out.print("   ");
            }
            System.out.println("  *");

        }
        for (int i = 0; i <= dlina+1; i++) {
            System.out.print("*  ");
        }
        System.out.println();
    }
}
