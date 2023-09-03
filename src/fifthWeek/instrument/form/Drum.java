package fifthWeek.instrument.form;

import fifthWeek.instrument.service.Instrument;

public class Drum extends InstrumentEntity implements Instrument {

    private int sizeDrum;

    public Drum(String name, int sizeDrum) {
        super(name);
        this.sizeDrum = sizeDrum;
    }

    @Override
    public void play() {
        System.out.printf("Играет %s, с размером %d см",getName(),getSizeDrum());
    }

    public int getSizeDrum() {
        return sizeDrum;
    }

    public void setSizeDrum(int sizeDrum) {
        this.sizeDrum = sizeDrum;
    }

}
