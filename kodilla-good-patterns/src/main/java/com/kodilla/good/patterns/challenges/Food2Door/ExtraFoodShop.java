package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class ExtraFoodShop implements Shop {

    private String producerName = "Extra Food Shop";
    private List<Product> extraFoodShopProductList = new ArrayList<>();

    public List<Product> productListEFS() {
        extraFoodShopProductList.add(0, new Product("Wafle Kukurydziane", 250));
        extraFoodShopProductList.add(1, new Product("Wafle ryżowe", 100));
        extraFoodShopProductList.add(2, new Product("Orzechy nerkowca", 25));
        extraFoodShopProductList.add(3, new Product("Orzechy włoskie", 29));

        return extraFoodShopProductList;
    }

    public String getProducername() {
        return producerName;
    }

    public List<Product> getExtraFoodShopProductList() {
        return extraFoodShopProductList;
    }

    @Override
    public void process() {

    }
}
