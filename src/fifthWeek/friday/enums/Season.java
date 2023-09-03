package fifthWeek.friday.enums;

public enum Season {
    WINTER(-10,"Зима") {
        public void tellAboutSeason() {
            System.out.println(" this is Winter");
        }
    },
    AUTUMN(20, "Осень") {
        public void tellAboutSeason() {
            System.out.println(" this is Autumn");
        }
    },
    SPRING(18,"Весна") {
        public void tellAboutSeason() {
            System.out.println(" this is Spring");
        }
    },
    SUMMER(40,"Лето") {
        public void tellAboutSeason() {
            System.out.println("This is Summer");
        }
    };

    private int avgTemp;
    private String inRussian;

    Season(int avgTemp, String inRussian) {
        this.avgTemp = avgTemp;
        this.inRussian = inRussian;
    }

    public int getAvgTemp() {
        return avgTemp;
    }

    public String getInRussian() {
        return inRussian;
    }
    public abstract void tellAboutSeason();
}
