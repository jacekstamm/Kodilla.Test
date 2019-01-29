package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.ArrayList;

public class ExtraFoodShop{

    private ArrayList<Product> extraFoodShopProductList = new ArrayList<>();

    public ExtraFoodShop() {
        productListEFS();
    }

    public ArrayList<Product> productListEFS() {
        extraFoodShopProductList.add(0, new Product("Wafle Kukurydziane", 250));
        extraFoodShopProductList.add(1, new Product("Wafle ryżowe", 100));
        extraFoodShopProductList.add(2, new Product("Orzechy nerkowca", 25));
        extraFoodShopProductList.add(3, new Product("Orzechy włoskie", 29));

        return extraFoodShopProductList;
    }
}
