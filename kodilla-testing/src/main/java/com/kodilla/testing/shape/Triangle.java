package com.kodilla.testing.shape;

import java.util.Objects;

// klasa trojkat
class Triangle implements Shape {


    String name;
    double field;
    int a = 5;
    int h = 8;

    public Triangle(String name, double field) {
        this.name = name;
        this.field = field;
        this.a = a;
        this.h = h;
    }

    @Override
    public String getShapeName() {  //zwroc nazwe figury
        return name;
    }

    @Override
    public double getField() {  //liczy pole trojata
        field = (1 / 2) * a * h;
        return field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.field, field) == 0 &&
                a == triangle.a &&
                h == triangle.h &&
                Objects.equals(name, triangle.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, field, a, h);
    }
}
