package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminator(ArrayList<Integer> numbers) {

        ArrayList<Integer> parzyste = new ArrayList<>();
        for (Integer liczby : numbers) {
            if (liczby % 2 == 0) {
                parzyste.add(liczby);
            }
        }
        return parzyste;
    }

    public boolean isEmpty() {
        return true;
    }
}
