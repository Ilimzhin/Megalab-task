package fifthWeek.instrument.form;

import fifthWeek.instrument.service.Instrument;

public class Guitar extends InstrumentEntity implements Instrument {

    private int amountStringGuitar;

    @Override
    public void play() {
        System.out.printf("Играет %s, с %d струнами\n", getName(), getAmountStringGuitar());
    }

    public Guitar(String name, int amountStringGuitar) {
        super(name);
        this.amountStringGuitar = amountStringGuitar;
    }

    public Guitar(String name) {
        super(name);
    }

    public int getAmountStringGuitar() {
        return amountStringGuitar;
    }

    public void setAmountStringGuitar(int amountStringGuitar) {
        this.amountStringGuitar = amountStringGuitar;
    }

}
