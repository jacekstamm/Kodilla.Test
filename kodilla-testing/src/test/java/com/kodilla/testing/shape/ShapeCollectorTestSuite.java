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
    public void testShouldAddShapeToShapeList() {
        //Given
        Circle circle = new Circle("Circle", 7.8);
        Triangle triangle = new Triangle("Triangle", 10.4, 5.9);
        Square square = new Square("Square", 8.96);
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        shapeCollector.addShape(0, circle);
        //Then
        Assert.assertTrue(shapeCollector.shapeList.contains(circle));
    }

    @Test
    public void testShouldRemoveShapeFromShapeList() {
        //Given
        Circle circle = new Circle("Circle", 7.8);
        Triangle triangle = new Triangle("Triangle", 10.4, 5.9);
        Square square = new Square("Square", 8.96);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.shapeList.add(circle);

        //When
        shapeCollector.removeShape(circle);

        //Then
        Assert.assertFalse(shapeCollector.shapeList.contains(circle));
    }

    @Test
    public void testShouldGetShapeFromShapeList() {
        //Given
        Circle circle = new Circle("Circle", 7.8);
        Triangle triangle = new Triangle("Triangle", 10.4, 5.9);
        Square square = new Square("Square", 8.96);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addShape(0, circle);

        //When
        Shape result = shapeCollector.getShape(0);

        //Then
        Assert.assertEquals(circle, result);
    }
}