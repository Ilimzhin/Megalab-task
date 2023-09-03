package fifthWeek.instrument.form;

import fifthWeek.instrument.service.Instrument;

public class Pipe extends InstrumentEntity implements Instrument {

    private int diameter;

    @Override
    public void play() {
        System.out.printf("Играет %s, с диметром -> %d см \n", getName(),getDiameter());
    }

    public Pipe(String name) {
        super(name);
    }

    public Pipe(String name, int diameter) {
        super(name);
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
}
