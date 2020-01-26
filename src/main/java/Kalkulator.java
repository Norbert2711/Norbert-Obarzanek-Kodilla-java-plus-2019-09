class Kalkulator {
    private int dodawanie(int a, int b) {
        return a + b;
    }

    private int odejmowanie(int c, int d) {
        return c - d;
    }

    private void dodaj() {
        int wynik = dodawanie(10, 20);
        System.out.println("Dodawanie:" + wynik);
    }

    private void odejmij() {
        int wynik2 = odejmowanie(23, 13);
        System.out.println("Odejmowanie: " + wynik2);
    }

    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        kalkulator.dodaj();
        kalkulator.odejmij();
    }
}