package factory.simple;

import factory.Product;
import factory.ProductEnum;

public class SimpleClient {
    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        Product product = factory.createProduct(ProductEnum.AIRCRAFT);
        product.doSomething();
    }
}
