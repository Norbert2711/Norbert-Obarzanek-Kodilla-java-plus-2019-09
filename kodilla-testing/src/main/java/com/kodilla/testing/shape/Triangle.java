package com.kodilla.testing.shape;
// klasa trojkat
 class Triangle implements Shape {

    int a = 5;
    int h = 8;
    String name;
    int field;
    public Triangle(String name, int field) {
        this.name = name;
        this.field=field;
    }
Triangle triangle =new Triangle("Triangle",field);
    @Override
    public String getShapeName() {  //zwroc cazwe figury
        return "I'm a Trinagle. Jestem trójątem."+ name;
    }

    @Override
    public String getField() {  //liczy pole trojata
    field = (1/2*a*h);
        return "Triangle's field: "+field;
    }
}
