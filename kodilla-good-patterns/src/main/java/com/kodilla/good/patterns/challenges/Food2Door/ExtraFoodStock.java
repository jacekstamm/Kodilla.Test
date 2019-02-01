package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.HashMap;

public class ExtraFoodStock {

    public HashMap<String, Integer> stockEF() {
        HashMap<String, Integer> extraFoodStockList = new HashMap<>();
        extraFoodStockList.put("Wafle kukurydziane", 250);
        extraFoodStockList.put("Wafle ryżowe", 100);
        extraFoodStockList.put("Orzechy nerkowca", 25);
        extraFoodStockList.put("Orzechy włoskie", 29);
        return extraFoodStockList;
    }
}
