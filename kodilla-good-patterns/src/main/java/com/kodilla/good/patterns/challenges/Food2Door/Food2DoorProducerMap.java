package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.ArrayList;
import java.util.HashMap;

public class Food2DoorProducerMap {

    private ExtraFoodShop extraFoodShop;
    private GlutenFreeShop glutenFreeShop;
    private HealthyShop healthyShop;

    private HashMap<String, ArrayList<Product>> f2DProducerMap = new HashMap<>();

    public HashMap<String, ArrayList<Product>> producerMap() {
        f2DProducerMap.put("Gluten Free Shop", glutenFreeShop.productListGFS());
        f2DProducerMap.put("Extra Food Shop", extraFoodShop.productListEFS());
        f2DProducerMap.put("Healthy Shop", healthyShop.productListHS());

        return f2DProducerMap;
    }
}
