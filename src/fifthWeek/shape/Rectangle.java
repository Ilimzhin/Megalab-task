package fifthWeek.shape;

public class Rectangle extends Shape{

    private int x1Rectangle;
    private int y1Rectangle;
    private int x2Rectangle;
    private int y2Rectangle;

    public Rectangle(String color, int x1Rectangle) {
        super(color);
        this.x1Rectangle = x1Rectangle;
    }

    public Rectangle(String color, int x1Rectangle, int y1Rectangle, int x2Rectangle, int y2Rectangle) {
        super(color);
        this.x1Rectangle = x1Rectangle;
        this.y1Rectangle = y1Rectangle;
        this.x2Rectangle = x2Rectangle;
        this.y2Rectangle = y2Rectangle;
    }

    @Override
    void draw() {
        System.out.println("some");
    }

    public int getX1Rectangle() {
        return x1Rectangle;
    }

    public void setX1Rectangle(int x1Rectangle) {
        this.x1Rectangle = x1Rectangle;
    }

    public int getY1Rectangle() {
        return y1Rectangle;
    }

    public void setY1Rectangle(int y1Rectangle) {
        this.y1Rectangle = y1Rectangle;
    }

    public int getX2Rectangle() {
        return x2Rectangle;
    }

    public void setX2Rectangle(int x2Rectangle) {
        this.x2Rectangle = x2Rectangle;
    }

    public int getY2Rectangle() {
        return y2Rectangle;
    }

    public void setY2Rectangle(int y2Rectangle) {
        this.y2Rectangle = y2Rectangle;
    }
}
