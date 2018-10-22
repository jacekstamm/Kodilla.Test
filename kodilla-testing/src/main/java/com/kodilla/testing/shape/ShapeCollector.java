package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector{
    public Shape shape;

    public ShapeCollector() {
        this.shape = shape;
    }

    ArrayList<Shape> shapeList = new ArrayList<Shape>();

    public void addShape(int n, Shape shape) {
        shapeList.add(n, shape);
    }

    public void removeShape(Shape shape) {
        shapeList.remove(shape);
    }

    public Shape getShape(int n) {
        if (n >= 0 && n < shapeList.size()) {
            shape = shapeList.get(n);
        }
        return shape;
    }

    public void showShape(int n) {
        Shape show = shapeList.get(n);
        System.out.println(show);
    }
}
