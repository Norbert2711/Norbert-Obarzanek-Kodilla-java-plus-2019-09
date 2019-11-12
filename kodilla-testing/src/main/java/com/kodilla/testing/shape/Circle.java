package com.kodilla.testing.shape;
//klasa kolo
class Circle implements Shape{

double pi= Math.PI;
int r=4;
String name;
double field;

    public Circle(String name, double field) {
        this.name = name;
        this.field=field;
    }
Circle circle = new Circle("Circle", field);

    @Override
    public String getShapeName() {
        return "I'm a Circle. Jestem kołem." +name;
    }

    @Override
    public String getField() {
    field= pi*(r*r);
        return "Circle's field: "+field;
    }

}

