package com.kodilla.testing;

public class TestingMain {
    public static void main(String[] args) {

        Calkulator kalkulator = new Calkulator();

        System.out.println("Dodawanie: " + kalkulator.dodaj(100, 55));
        System.out.println("Odejmowanie: " + kalkulator.odejmij(100, 55));

        if (kalkulator.dodaj(100, 55) == 155) {
            System.out.println("Test OK!");
        } else {
            System.out.println("Test nie powiodl sie!");
        }
        if (kalkulator.odejmij(100, 55) == 45) {
            System.out.println("Test OK!");
        } else {
            System.out.println("Test nie powiodl sie!");
        }
    }


}