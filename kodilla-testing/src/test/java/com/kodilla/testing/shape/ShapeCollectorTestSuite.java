package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests. Poczatek!");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished. Testy ZAKONCZONE");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test. Numer TESTU:  #" + testCounter);
    }

    @Test
    public void testAddFigure() {  //Test nr 1.
        Circle circle = new Circle("Circle", 50.26);
        ArrayList<Shape> figures = new ArrayList<Shape>();
        figures.add(circle);
        Assert.assertTrue(figures.isEmpty());
    }

    @Test
    public void testRemoveFigure() {  //Test nr 2.
        Circle circle = new Circle("Circle", 50.26);
        ArrayList<Shape> figures = new ArrayList<Shape>();
        figures.add(circle);
        figures.remove(0);
        Assert.assertTrue(figures.isEmpty());
    }

    @Test
    public void testGetFigure() {
        Circle circle = new Circle("Circle", 50.26);
        ArrayList<Shape> figures = new ArrayList<Shape>();
        figures.add(circle);
        figures.get(0);
        Shape result = (figures.get(0));
    }

    @Test
    public void testShowFigures(){
        Circle circle = new Circle("Circle", 50.26);
        Square square = new Square("Square",25);
        Triangle triangle =new Triangle("Triangle",20);
        System.out.println(circle);
        System.out.println(square);
        System.out.println(triangle);
    }
}
