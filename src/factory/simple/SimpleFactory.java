package factory.simple;

import factory.AircraftProduct;
import factory.CalculatorProduct;
import factory.Product;
import factory.ProductEnum;

public class SimpleFactory {
    public Product createProduct(ProductEnum type) {
        Product product = null;
        switch (type) {
            case AIRCRAFT -> product = new AircraftProduct();
            case CALCULATOR -> product = new CalculatorProduct();
            default -> {
            }
        }
        return product;
    }
}
