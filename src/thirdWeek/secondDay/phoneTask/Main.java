package thirdWeek.secondDay.phoneTask;

public class Main {
    public static void main(String[] args) {
        Phone ph = new Phone();
        Phone phone = new Phone(25,"Mi", 200.52, 8000);
        Phone phone1 = new Phone();
        phone.typesPhone();
        phone.discount(phone, 10);
        phone.typesPhone();
        System.out.println();
        phone1.number = 234;
        phone1.weight = 212.24;
        phone1.model = "Motorola";
        phone1.price = 12000;
        Phone phone2 = new Phone();
        phone2.number = 432;
        phone2.weight = 251.21;
        phone2.model = "Samsung";
        phone2.price = 23000;



//        Phone[] phones = {phone, phone1, phone2};
//        for (Phone phs: phones) {
//            phs.typesPhone();
//            System.out.println();
//        }
    }
}
