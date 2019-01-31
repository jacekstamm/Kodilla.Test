package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.ArrayList;

public class GlutenFreeStock {

    public ArrayList<Product> stockGF() {
        ArrayList<Product> glutenFreeStockList = new ArrayList<>();
        glutenFreeStockList.add(0, new Product("Bułki królewskie", 87));
        glutenFreeStockList.add(1, new Product("Chleb z nasionami", 57));
        glutenFreeStockList.add(2, new Product("Chleb GF", 94));

        return glutenFreeStockList;
    }
}
