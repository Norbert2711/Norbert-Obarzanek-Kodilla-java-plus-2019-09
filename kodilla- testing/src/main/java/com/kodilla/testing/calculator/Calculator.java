package com.kodilla.testing.calculator;

class Calkulator {
int wynik;
int wynik2;
public Calkulator() {
    this.wynik = wynik;
    this.wynik2 = wynik2;

}
    public void dodaj() {

        wynik = dodawanie(60, 20);
    }
    public void odejmij() {

        wynik2 = odejmowanie(240, 30);
    }
    public int dodawanie(int a, int b)
    {
        return a + b;
    }
    public int odejmowanie(int a, int b) {
        return a - b;
    }
    public int getWynik(){
        return wynik;
    }
    public int getWynik2(){
        return wynik2;
    }
}