package com.kodilla.testing.shape;

import java.util.Objects;

//klasa kolo
class Circle implements Shape{

String name;
double field;
double pi= 3.14;
int r =4;

    public Circle(String name, double field) {
        this.name = name;
        this.field=field;
    }
    @Override
    public String getShapeName() {
        return name;
    }
    @Override
    public double getField() {
        field= pi*(r*r);
        return field;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.field, field) == 0 &&
                Double.compare(circle.pi, pi) == 0 &&
                r == circle.r &&
                Objects.equals(name, circle.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, field, pi, r);
    }
}

