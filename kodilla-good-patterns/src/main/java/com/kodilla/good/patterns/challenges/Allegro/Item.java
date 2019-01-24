package com.kodilla.good.patterns.challenges.Allegro;

import java.util.Objects;

public class Item {

    private final String name;
    private final long referenceNumber;
    private final double price;

    public Item(String name, long referenceNumber, double price) {
        this.name = name;
        this.referenceNumber = referenceNumber;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public long getReferenceNumber() {
        return referenceNumber;
    }

    @Override
    public String toString() {
        return "Item [name = " + name + ", price = " + price + "reference number = " + referenceNumber + " ]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item product = (Item) o;
        return Double.compare(product.price, price) == 0 &&
                Objects.equals(name, product.name) &&
                Objects.equals(referenceNumber, product.referenceNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, referenceNumber, price);
    }
}
