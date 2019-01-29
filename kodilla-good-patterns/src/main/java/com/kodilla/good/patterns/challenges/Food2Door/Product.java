package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.Objects;

public class Product {

    private String productName;
    private Integer quantity;

    public Product(String productName, Integer quantity) {
        this.productName = productName;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Integer setQuantity(Integer quantity) {
        this.quantity = quantity;
        return getQuantity();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(productName, product.productName) &&
                Objects.equals(quantity, product.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, quantity);
    }
}
