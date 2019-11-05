package com.kodilla.testing.calculator;
import com.kodilla.testing.calculator.Calkulator;

public class TestingMain {
    public static void main (String[] args) {
        Calkulator kalkulator = new Calkulator();

        kalkulator.dodaj();
        kalkulator.odejmij();
        int dodawanie =kalkulator.getWynik();
        int odejmowaie = kalkulator.getWynik2();
        System.out.println("Dodawanie: "+ dodawanie);
        System.out.println("Odejmowanie: "+ odejmowaie);

        if (dodawanie==80) {
            System.out.println("test OK");
        }else {
            System.out.println("Error!");
        }
        if (odejmowaie==210) {
            System.out.println("test OK");
        }else {
            System.out.println("Error!");
        }
    }
}