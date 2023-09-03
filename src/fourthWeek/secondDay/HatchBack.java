package fourthWeek.secondDay;

public class HatchBack extends Universal{
    public HatchBack(String model, String manufacturer, String mnfDate, int seatCount) {
        super(model, manufacturer, mnfDate, seatCount);
    }

    @Override
    public void toDisplay() {
        System.out.println(getModel() + " " + getSeatCount());

    }
}
