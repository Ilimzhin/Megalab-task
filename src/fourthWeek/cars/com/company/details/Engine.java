package fourthWeek.cars.com.company.details;

public class Engine {
    private String power;
    private String manufacturer; // производительность

    public Engine(String power, String manufacturer) {
        this.power = power;
        this.manufacturer = manufacturer;
    }

    public Engine() {
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power='" + power + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
