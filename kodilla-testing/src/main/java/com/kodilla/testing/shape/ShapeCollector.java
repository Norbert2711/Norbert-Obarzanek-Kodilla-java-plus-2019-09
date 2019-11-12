package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {


    public void addFigure(Shape shape){
        ArrayList<Shape> figures = new ArrayList<Shape>();
        figures.add(shape);
    }

    public void removeFigure(Shape shape){
        ArrayList<Shape> figures = new ArrayList<Shape>();
        figures.remove(figures.size()-1);
        System.out.println(figures);
    }

public void getFigure(int n){
    ArrayList<Shape> figures = new ArrayList<Shape>();
    for (n=0; n<3; n++){
    }
    System.out.println(figures.get(n));
}
  public void showFigures(Square square, Circle circle, Triangle triangle){

      System.out.println(square);
      System.out.println(circle);
      System.out.println(triangle);


    }
}
