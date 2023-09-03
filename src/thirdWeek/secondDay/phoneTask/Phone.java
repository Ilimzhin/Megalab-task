package thirdWeek.secondDay.phoneTask;

public class Phone {
    int number;
    String model;
    double weight;
    double price;

    public Phone() {
    }

    public Phone(int number,String model, double weight, double price) {
        this.number = number;
        this.model = model;
        this.weight = weight;
        this.price = price;
    }

    public void typesPhone() {
        System.out.printf("Модель телефона: %s \nномер телефона: %s \nвес телефона %.2f\nЦена телефона %.2f\n\n", model, number, weight, price);
    }

    double discount(Phone phone, double newPrice) {
        phone.price=price-(price/newPrice);
        return price;
    }

}
