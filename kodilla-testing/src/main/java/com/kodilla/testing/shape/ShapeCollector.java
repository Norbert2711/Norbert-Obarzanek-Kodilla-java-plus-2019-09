package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> figures = new ArrayList<Shape>();

    // dodanie figury
    public void addFigure(Shape shape) {
        figures.add(shape);
    }

    public int getSize() {
        return figures.size();
    }

    //usuniecie figury
    public void removeFigure(Shape shape) {
        figures.remove(shape);
    }

    //pobranie indexu figury
    public Shape getFigure(int n) {
        if (n >= 0 && n < figures.size()) {
            return figures.get(n);
        }
        return null;
    }

    //pokaz figury
    public void showFigures() {
        for (Shape show : figures) {
            System.out.println(show);
        }
    }
}