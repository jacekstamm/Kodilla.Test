package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.ArrayList;

public class ExtraFoodStock {

    public ArrayList<Product> stockEF() {
        ArrayList<Product> extraFoodStockList = new ArrayList<>();
        extraFoodStockList.add(0, new Product("Wafle kukurydziane", 250));
        extraFoodStockList.add(1, new Product("Wafle ryżowe", 100));
        extraFoodStockList.add(2, new Product("Orzechy nerkowca", 25));
        extraFoodStockList.add(3, new Product("Orzechy włoskie", 29));
        return extraFoodStockList;
    }
}
