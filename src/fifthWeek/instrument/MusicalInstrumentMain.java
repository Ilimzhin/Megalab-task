package fifthWeek.instrument;

import fifthWeek.instrument.form.Drum;
import fifthWeek.instrument.form.Guitar;
import fifthWeek.instrument.form.Pipe;
import fifthWeek.instrument.service.Instrument;

public class MusicalInstrumentMain {

    public static void main(String[] args) {
        Guitar guitar1 = new Guitar("Гитара", 8);
        Pipe pipe = new Pipe("Труба", 30);
        Drum drum = new Drum("Барабан", 30);
        Instrument[] instruments = {guitar1, pipe, drum};

        for (Instrument instrument : instruments) {
            instrument.play();
        }

    }
}
