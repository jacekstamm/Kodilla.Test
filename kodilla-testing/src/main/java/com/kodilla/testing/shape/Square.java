package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {
    private String name;
    private double sideOfTheSquare;

    public Square(String name, double sideOfTheSquare) {
        this.name = name;
        this.sideOfTheSquare = sideOfTheSquare;
    }

    public String getShapeName() {
        return name;

    }

    public double getField() {
        return sideOfTheSquare*sideOfTheSquare;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.sideOfTheSquare, sideOfTheSquare) == 0 &&
                Objects.equals(name, square.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sideOfTheSquare);
    }
}
