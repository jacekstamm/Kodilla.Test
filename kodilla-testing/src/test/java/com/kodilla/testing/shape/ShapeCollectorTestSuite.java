package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddShape() {
        //Given
        Circle circle = new Circle("Circle", 7.8);
        Triangle triangle = new Triangle("Triangle", 10.4, 5.9);
        Square square = new Square("Square", 8.96);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.shapeList.add(0, circle);
        shapeCollector.shapeList.add(1, triangle);
        shapeCollector.shapeList.add(2, square);
        //When
        Shape result = shapeCollector.addShape(circle);
        //Then
        Assert.assertEquals(shapeCollector.shapeList.get(0), result);
    }

    @Test
    public void testRemoveShape() {
        //Given
        Circle circle = new Circle("Circle", 7.8);
        Triangle triangle = new Triangle("Triangle", 10.4, 5.9);
        Square square = new Square("Square", 8.96);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.shapeList.add(0, circle);
        shapeCollector.shapeList.add(1, triangle);
        shapeCollector.shapeList.add(2, square);
        //When
        Shape result = shapeCollector.removeShape(circle);
        //Then
        Assert.assertEquals(shapeCollector.shapeList.get(0), result);
    }

    @Test
    public void testGetShape() {
        //Given
        Circle circle = new Circle("Circle", 7.8);
        Triangle triangle = new Triangle("Triangle", 10.4, 5.9);
        Square square = new Square("Square", 8.96);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.shapeList.add(0, circle);
        shapeCollector.shapeList.add(1, triangle);
        shapeCollector.shapeList.add(2, square);
        //When
        Shape result = shapeCollector.getShape();
        //Then
        Assert.assertEquals(shapeCollector.shapeList.get(0), result);
    }
}