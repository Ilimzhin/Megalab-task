package fifthWeek.shape;

//this is new Branch
public class ShapeMain {
    public static void main(String[] args) {
        Shape rectangle1 = new Rectangle("yellow",20,6);
        Shape circle1 = new Circle("Black", 15);
        System.out.println(rectangle1);
        System.out.println(circle1);

//        Shape[] shapes = {circle1,rectangle1,circle2};
//        for (Shape shape: shapes) {
//            System.out.println(shape);
//        }

    }
}
