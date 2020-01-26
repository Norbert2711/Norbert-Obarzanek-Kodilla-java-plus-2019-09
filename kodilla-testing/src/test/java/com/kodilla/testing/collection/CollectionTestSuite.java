package com.kodilla.testing.collection;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Test
    public void testOddNumbersExterminatorEmptyList() {

        OddNumbersExterminator puste = new OddNumbersExterminator();

        ArrayList<Integer> wynik = puste.exterminator(new ArrayList<Integer>());
        Assert.assertTrue(wynik.isEmpty());
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {

        OddNumbersExterminator puste = new OddNumbersExterminator();
        ArrayList<Integer> mieszane = new ArrayList<>();
        mieszane.add(5);
        mieszane.add(4);
        mieszane.add(6);
        mieszane.add(1);
        mieszane.add(9);
        mieszane.add(3);
        puste.exterminator(mieszane);

        ArrayList<Integer> result = puste.exterminator(mieszane);

        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(4);
        lista.add(6);
        Assert.assertEquals(lista, result);

    }
}

