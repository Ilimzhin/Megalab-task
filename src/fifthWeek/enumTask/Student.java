package fifthWeek.enumTask;

import fifthWeek.enumTask.enums.Payment;
import fifthWeek.enumTask.enums.Pl;

public class Student extends Person{
    private Payment payment;

    public Student(String fullName, Pl pl, int age, boolean gender, Payment payment) {
        super(fullName, pl, age, gender);
        this.payment = payment;
    }

    @Override
    public String toString() {
        return super.toString() + "  ->  Student{" +
                "payment=" + payment +
                '}';
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
