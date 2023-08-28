package fifthWeek.shape;

public class Circle extends Shape{

    private int xCircle;
    private int yCircle;
    private int pointCircle;

    public Circle(String color, int xCircle, int yCircle, int pointCircle) {
        super(color);
        this.xCircle = xCircle;
        this.yCircle = yCircle;
        this.pointCircle = pointCircle;
    }

    @Override
    void draw() {
        System.out.println("Something");
    }

    public int getxCircle() {
        return xCircle;
    }

    public void setxCircle(int xCircle) {
        this.xCircle = xCircle;
    }

    public int getyCircle() {
        return yCircle;
    }

    public void setyCircle(int yCircle) {
        this.yCircle = yCircle;
    }

    public int getPointCircle() {
        return pointCircle;
    }

    public void setPointCircle(int pointCircle) {
        this.pointCircle = pointCircle;
    }
}
