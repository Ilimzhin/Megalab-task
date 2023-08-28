package fifthWeek.shape;

public class Circle extends Shape{

    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
        draw();
    }

    @Override
    void draw() {
        for (int i = -radius; i <= radius; i++) {
            for (int j = -radius; j <= radius; j++) {
                if (i * i + j * j <= radius * radius) {
                    System.out.print("*  ");
//                    try {
//                        Thread.sleep(10);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();

        }
    }


}
