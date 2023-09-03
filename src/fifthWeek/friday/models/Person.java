package fifthWeek.friday.models;

import fifthWeek.friday.enums.Season;

public class Person {
    private String name;
    private Season season;

    public Person(String name, Season season) {
        this.name = name;
        this.season = season;
    }

    @Override
    public String toString() {
        return "Person \n" +
                "name= " + name + ", \n" +
                "season= " + season;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }
}
