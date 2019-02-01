package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.ArrayList;
import java.util.HashMap;

public class GlutenFreeStock {

    public HashMap<String, Integer> stockGF() {
        HashMap<String, Integer> glutenFreeStockList = new HashMap<>();
        glutenFreeStockList.put("Bułki królewskie", 87);
        glutenFreeStockList.put("Chleb z nasionami", 57);
        glutenFreeStockList.put("Chleb GF", 94);

        return glutenFreeStockList;
    }
}
