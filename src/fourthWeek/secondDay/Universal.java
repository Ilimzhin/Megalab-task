package fourthWeek.secondDay;

public class Universal extends Car{
    private int seatCount;

    public Universal(String model, String manufacturer, String mnfDate, int seatCount) {
        super(model, manufacturer, mnfDate);
        this.seatCount = seatCount;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }
}
