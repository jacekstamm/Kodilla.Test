package com.kodilla.testing.shape;

public class Program {

    public static void main(String[] args) {
        Circle circle = new Circle("Circle", 1.9);
        Triangle triangle = new Triangle("Triangle", 6.9, 3.8);
        Square square = new Square("Square", 5.9);
        ShapeCollector program = new ShapeCollector();

        program.addShape(0, circle);
        program.addShape(1, triangle);
        program.addShape(2, square);

        program.showShape(2) ;

        program.getShape(0);
    }
}
