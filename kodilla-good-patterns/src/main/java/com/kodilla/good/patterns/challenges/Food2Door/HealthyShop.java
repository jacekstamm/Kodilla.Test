package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.ArrayList;

public class HealthyShop{

    private ArrayList<Product> healthyShopProductList = new ArrayList<>();

    public HealthyShop() {
        productListHS();
    }

    public ArrayList<Product> productListHS() {
        healthyShopProductList.add(0, new Product("Spirulina", 257));
        healthyShopProductList.add(1, new Product("Olej kokosowy", 25));
        healthyShopProductList.add(2, new Product("Makaron gryczany", 68));

        return healthyShopProductList;
    }
}
