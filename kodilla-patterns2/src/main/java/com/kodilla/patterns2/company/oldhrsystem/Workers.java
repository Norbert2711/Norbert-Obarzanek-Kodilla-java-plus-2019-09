package com.kodilla.patterns2.company.oldhrsystem;

public class Workers {

    private String[][] workers = {
            {"670312344", "John", "Smith"},
            {"820215235", "Ivone", "Novak"},
            {"920322525", "Jessie", "Pinkman"},
            {"770322342", "Walter", "White"},
            {"760213523", "Clara", "Lanson"}};

    private double[] salaries = {
            4500.00,
            3700.00,
            4350.00,
            9000.00,
            6200.00};

    public String getWorker(int n) {
        if (n > salaries.length) {
            return "*";
        }
        return workers[n][0] + ", " + workers[n][1] + ", " + workers[n][2] +
                ", " + salaries[n];
    }

    public String[][] getWorkers() {
        return workers;
    }

    public double[] getSalaries() {
        return salaries;
    }

}


