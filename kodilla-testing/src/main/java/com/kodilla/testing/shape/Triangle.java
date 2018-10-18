package com.kodilla.testing.shape;

import java.util.Objects;

class Triangle implements Shape {
    private String name;
    private double baseOfTheTriangle;
    private double heightOfTheTriangle;

    public Triangle(String name, double baseOfTheTriangle, double heightOfTheTriangle) {
        this.name = name;
        this.baseOfTheTriangle = baseOfTheTriangle;
        this.heightOfTheTriangle = heightOfTheTriangle;
    }

    public String getShapeName() {
        return name;
    }

    public double getField() {
        return (baseOfTheTriangle*heightOfTheTriangle)/2.0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.baseOfTheTriangle, baseOfTheTriangle) == 0 &&
                Double.compare(triangle.heightOfTheTriangle, heightOfTheTriangle) == 0 &&
                Objects.equals(name, triangle.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, baseOfTheTriangle, heightOfTheTriangle);
    }
}
