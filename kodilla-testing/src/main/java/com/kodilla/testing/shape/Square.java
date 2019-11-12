package com.kodilla.testing.shape;
//klasa kwadrat

class Square implements Shape {
    int a =5;
    String name;
    int field;

    public Square(String name, int field) {
        this.name = name;
        this.field=field;
    }
Square square = new Square("Square",field);

    @Override
    public String getShapeName() {  //zwroc nazwe figury
        return "I'm a Square. Jestem Kwadratem. "+name;

    }
    @Override
    public String getField() {
    field = a*a; //licz pole kwadratu
        return "Square's field = "+field;
    }
}
