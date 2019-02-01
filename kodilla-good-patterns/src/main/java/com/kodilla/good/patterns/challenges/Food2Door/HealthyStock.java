package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.HashMap;

public class HealthyStock {

    public HashMap<String, Integer> stockHS() {
        HashMap<String, Integer> healthyStockList = new HashMap<>();
        healthyStockList.put("Spirulina", 275);
        healthyStockList.put("lej kokosowy", 72);
        healthyStockList.put("Makaron gryczany", 94);

        return healthyStockList;
    }
}
