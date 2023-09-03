package fourthWeek.models;

import java.util.Arrays;
import java.util.Random;

public class Guitar {
    Random random = new Random();
    private String color;
    private int stringCount;
    private int[] tensions = new int[stringCount];

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getStringCount() {
        return stringCount;
    }

    public void setStringCount(int stringCount) {
        this.stringCount = stringCount;
    }

    public int[] getTensions() {
        return tensions;
    }

    public Guitar(String color, int stringCount) {
        this.color = color;
        this.stringCount = stringCount;
    }
    public Guitar(String color, int stringCount, int[] tensions) {
        this.color = color;
        this.stringCount = stringCount;
        this.tensions = tensions;
    }

    public Guitar() {
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "color='" + color + '\'' +
                ", stringCount=" + stringCount +
                ", tensions=" + Arrays.toString(tensions) +
                '}';
    }

    public void tune(int stringCount) {
        this.tensions = new int[stringCount];

//        Arrays.fill(tensions, 5);
        for (int i = 0; i < stringCount; i++) {
            tensions[i] = 5;
        }
    }

    public void play() {
        System.out.println("По полям, по полям\n" +
                "Синий трактор едет к нам.\n" +
                "У него в прицепе кто-то песенку поет!\n" +
                "А ну, малыш, давай!");
        unsettle();

    }
    private void unsettle() {
        this.tensions = new int[stringCount];
        for (int i = 0; i < tensions.length; i++) {
            int randomRef = random.nextInt(0,3);
            tensions[i] = randomRef;
        }
    }

}
