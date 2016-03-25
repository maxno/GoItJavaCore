package dz3.src.ua.com.goit.dolshanskyi.module3.task3;

import java.util.List;
import java.util.Map;

public class MusicShop {

    private List<MusicalInstrument> musicalInstruments;

    public List<MusicalInstrument> getMusicalInstruments() {
        return musicalInstruments;
    }

    public void setMusicalInstruments(List<MusicalInstrument> musicalInstruments) {
        this.musicalInstruments = musicalInstruments;
    }

    public List<MusicalInstrument> prepareListOfInstrumentsToRemove(Map<MusicalInstrument, Integer> order) throws NoSuchAmountOfInstrumentException {

        List<MusicalInstrument> musicalInstrumentsCheck = this.musicalInstruments;

        for (Map.Entry<MusicalInstrument, Integer> orderEntry : order.entrySet()) {

            if (musicalInstrumentsCheck.remove(orderEntry.getKey()) != true ) {
                throw new NoSuchAmountOfInstrumentException("[[ERROR]] No such amount of " + orderEntry.getKey().getName() + "'.");
            }

        }

        return musicalInstrumentsCheck;
    }
}
