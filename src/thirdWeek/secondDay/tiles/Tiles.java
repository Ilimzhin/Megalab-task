package thirdWeek.secondDay.tiles;

public class Tiles {

    String brand;
    int size_h;
    int size_w;
    double price;

    public Tiles(String brand, int size_h, int size_w, double price) {
        this.brand = brand;
        this.size_h = size_h;
        this.size_w = size_w;
        this.price = price;
    }

    public Tiles() {
    }

    void getData() {
        System.out.println( "Название компании: " + brand + "\nДлина: " + size_h + "\nШирина: " + size_w + "\nЦена: " + price) ;
    }

    @Override
    public String toString() {
        return "\nTiles{" +
                "\nbrand='" + brand + '\'' +
                "\nsize_h=" + size_h +
                "\nsize_w=" + size_w +
                "\nprice=" + price + "\n";
    }
}
