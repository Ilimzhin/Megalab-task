package fourthWeek.secondDay;

public class Car {


    String model;
    String manufacturer;
    String mnfDate;

    public Car(String model, String manufacturer, String mnfDate) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.mnfDate = mnfDate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getMnfDate() {
        return mnfDate;
    }

    public void setMnfDate(String mnfDate) {
        this.mnfDate = mnfDate;
    }

    public void toDisplay() {
        System.out.println(model);
    }
}
