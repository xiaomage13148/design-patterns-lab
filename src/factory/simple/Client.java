package factory.simple;

public class Client {
    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        Product product = factory.createProduct(ProductEnum.AIRCRAFT);
        product.doSomething();
    }
}
