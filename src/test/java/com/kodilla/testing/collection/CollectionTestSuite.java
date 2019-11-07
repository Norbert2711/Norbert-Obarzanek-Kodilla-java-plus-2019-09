package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Before;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void testOddNumbersExterminatorEmptyList() {

        OddNumbersExterminator puste = new OddNumbersExterminator();
        puste.exterminator(new ArrayList<Integer>());
        if (puste.isEmpty()) {
            System.out.println("Test ok!");
        } else {
            System.out.println("Blad test");
        }
    }
        @After
       public void testOddNumbersExterminatorNormalList() {

            OddNumbersExterminator puste = new OddNumbersExterminator();
            puste.exterminator(new ArrayList<Integer>());
            ArrayList<Integer> mieszane = new ArrayList<>();
            for (Integer rozne : mieszane) {
                if (rozne > 20) {
                    mieszane.add(rozne);
                    System.out.println("Test ok");
                } else {
                    System.out.println("Blad test");
                }
            }


        }
    }

