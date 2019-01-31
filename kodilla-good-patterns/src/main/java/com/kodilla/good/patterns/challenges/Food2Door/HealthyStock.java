package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.ArrayList;

public class HealthyStock {

    public ArrayList<Product> stockHS() {
        ArrayList<Product> healthyStockList = new ArrayList<>();
        healthyStockList.add(0, new Product("Spirulina", 275));
        healthyStockList.add(1, new Product("lej kokosowy", 72));
        healthyStockList.add(2, new Product("Makaron gryczany", 94));

        return healthyStockList;
    }
}
