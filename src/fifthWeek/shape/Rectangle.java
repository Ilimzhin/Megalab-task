package fifthWeek.shape;

public class Rectangle extends Shape{

    private int widthRectangle;
    private int lengthRectangle;

    public Rectangle(String color, int widthRectangle, int lengthRectangle) {
        super(color);
        this.widthRectangle = widthRectangle;
        this.lengthRectangle = lengthRectangle;
        draw();
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "color=" + getColor() +
                ", widthRectangle=" + widthRectangle +
                ", lengthRectangle=" + lengthRectangle +
                '}';
    }

    @Override
    void draw() {
        for (int i = 0; i < lengthRectangle; i++) {
            for (int j = 0; j < widthRectangle; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public int getWidthRectangle() {
        return widthRectangle;
    }

    public void setWidthRectangle(int widthRectangle) {
        this.widthRectangle = widthRectangle;
    }

    public int getLengthRectangle() {
        return lengthRectangle;
    }

    public void setLengthRectangle(int lengthRectangle) {
        this.lengthRectangle = lengthRectangle;
    }

}
