package factory.method;

import factory.CalculatorProduct;
import factory.Product;

public class CalculatorFactory implements Factory {
    @Override
    public Product factoryMethod() {
        return new CalculatorProduct();
    }
}
