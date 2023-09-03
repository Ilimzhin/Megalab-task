package thirdWeek.secondDay.tiles;

import java.util.Arrays;

public class TilesMain {
    public static void main(String[] args) {

        Tiles tiles1 = new Tiles("Bishkek-tiles", 100, 150, 50.0);
        Tiles tiles2 = new Tiles("Osh-tiles", 150, 20, 55.0);
        Tiles tiles3 = new Tiles("Kazakhstan-tiles", 130, 180, 75.0);

        Tiles[] tiles = {tiles1, tiles2, tiles3};
//        System.out.println(Arrays.toString(tiles));
        System.out.println();
        for (Tiles t : tiles) {
            t.getData();
            System.out.println();
        }
        System.out.println();

    }
}
