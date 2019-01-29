package com.kodilla.good.patterns.challenges.Food2Door;

public class ExtraFoodShop implements Shop {

    private ExtraFoodStock extraFoodStock = new ExtraFoodStock();

    private boolean isAvailable(Product product){
        return extraFoodStock.stockEF().contains(product);
    }

    private int differenceQuantity(Product product) {
        int index = extraFoodStock.stockEF().indexOf(product);
        return extraFoodStock.stockEF().get(index).getQuantity() - product.getQuantity();
    }

    @Override
    public boolean process(Product product) {
        int index = extraFoodStock.stockEF().indexOf(product);
        for (int x = 0; x < extraFoodStock.stockEF().size(); x++) {
            if (extraFoodStock.stockEF().get(x).getProductName().equals(product.getProductName())){
                break;
            }
        }
        if (isAvailable(product) && extraFoodStock.stockEF().get(index).getQuantity() >= product.getQuantity()) {
            extraFoodStock.stockEF().remove(index);
            extraFoodStock.stockEF().add(index, new Product(product.getProductName(), differenceQuantity(product)));
            return true;
        } else {
            return false;
        }
    }
}