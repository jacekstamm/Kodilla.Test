package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class GlutenFreeShop implements Shop {

    private List<Product> glutenFreeShopProductList = new ArrayList<>();

    public List<Product> productListGFS() {
        glutenFreeShopProductList.add(0, new Product("Bułki królewskie", 87));
        glutenFreeShopProductList.add(1, new Product("Chleb z nasionami chia", 57));
        glutenFreeShopProductList.add(2, new Product("Chleb ciemny GF", 12));

        return glutenFreeShopProductList;
    }

    public List<Product> getGlutenFreeShopProductList() {
        return glutenFreeShopProductList;
    }

    @Override
    public void process() {

    }
}
