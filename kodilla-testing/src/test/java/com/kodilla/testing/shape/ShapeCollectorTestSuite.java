package com.kodilla.testing.shape;

import org.junit.*;

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
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle("Circle", 56.56);
        shapeCollector.addFigure(circle);
        int result= shapeCollector.getSize();
        Assert.assertEquals(1,result);
    }

    @Test
    public void testRemoveFigure() {  //Test nr 2.
        ShapeCollector shapeCollector= new ShapeCollector();
        Circle circle = new Circle("Circle", 50.26);
        Circle square = new Circle("Square", 56);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        shapeCollector.removeFigure(circle);
        int result = shapeCollector.getSize();
        Assert.assertEquals(1, result);
    }

    @Test
    public void testGetFigure() {       //Test nr 3
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle("Circle", 50.26);
        Circle triangle = new Circle("Triangle", 50);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);
        Shape result = shapeCollector.getFigure(0);
        Assert.assertEquals(circle, result);
    }
}
