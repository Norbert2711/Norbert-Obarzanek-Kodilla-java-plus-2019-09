package com.kodilla.testing.shape;

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
    public void testAddFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle("Circle", 55);
        shapeCollector.addFigure(circle);
        int result = shapeCollector.getSize();
        Assert.assertEquals(1, result);
    }

    @Test
    public void testRemoveFigures() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle("Circle", 34);
        Square square = new Square("Square, ", 45);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(circle);
        shapeCollector.removeFigure(circle);
        int result = shapeCollector.getSize();
        Assert.assertEquals(1, result);

    }

    @Test
    public void getFigure() {
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle("Circle", 34);
        Square square = new Square("Square, ", 45);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        Shape result = shapeCollector.getFigure(0);
        Assert.assertEquals(circle, result);
    }

}