package com.kodilla.testing.shape;
//klasa kwadrat

import java.util.Objects;

class Square implements Shape {
    String name;
    double field;
    int a = 5;

    public Square(String name, double field) {
        this.name = name;
        this.field = field;
        this.a = a;
    }

    @Override
    public String getShapeName() {  //zwroc nazwe figury
        return name;
    }

    @Override
    public double getField() {
        field = a * a;
        return field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.field, field) == 0 &&
                a == square.a &&
                Objects.equals(name, square.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, field, a);
    }
}
