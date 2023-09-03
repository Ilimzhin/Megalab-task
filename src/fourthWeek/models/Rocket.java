package fourthWeek.models;

public class Rocket {

    private String name;
    private String engine;
    private double weight;
    private boolean isAutopilot;

    public Rocket() {
    }

    public Rocket(String name, String engine, double weight, boolean isAutopilot) {
        this.name = name;
        this.engine = engine;
        this.weight = weight;
        this.isAutopilot = isAutopilot;
    }

    @Override
    public String toString() {
        return "Rocket{" +
                "name='" + name + '\'' +
                ", engine='" + engine + '\'' +
                ", weight=" + weight +
                ", isAutopilot=" + isAutopilot +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight<0 || weight>5000000.0) {
            System.out.println("incorrect");
        }
        this.weight = weight;
    }

    public boolean isAutopilot() {
        return isAutopilot;
    }

    public void setAutopilot(boolean autopilot) {
        isAutopilot = autopilot;
    }
}
