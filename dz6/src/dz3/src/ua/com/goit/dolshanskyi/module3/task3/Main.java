package dz3.src.ua.com.goit.dolshanskyi.module3.task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args){

        MusicShop musicShop = new MusicShop();

        List<MusicalInstrument> musicalInstruments = new ArrayList<MusicalInstrument>();

        musicalInstruments.add(new Guitar());
        musicalInstruments.add(new Guitar());
        musicalInstruments.add(new Guitar());
        musicalInstruments.add(new Guitar());

        musicalInstruments.add(new Piano());
        musicalInstruments.add(new Piano());
        musicalInstruments.add(new Piano());

        musicalInstruments.add(new Trumpet());
        musicalInstruments.add(new Trumpet());
        musicalInstruments.add(new Trumpet());
        musicalInstruments.add(new Trumpet());
        musicalInstruments.add(new Trumpet());
        musicalInstruments.add(new Trumpet());
        musicalInstruments.add(new Trumpet());
        musicalInstruments.add(new Trumpet());

        musicShop.setMusicalInstruments(musicalInstruments);

        Map<MusicalInstrument, Integer> order = new HashMap<>();
        order.put(new Guitar(), 40);


        try {
            musicShop.prepareListOfInstrumentsToRemove(order);
        } catch (NoSuchAmountOfInstrumentException e) {
            e.printStackTrace();
        }
    }
}
