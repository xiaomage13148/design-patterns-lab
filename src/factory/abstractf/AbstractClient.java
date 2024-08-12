package factory.abstractf;

public class AbstractClient {
    public static void main(String[] args) {
        Factory factory = new Factory1();
        factory.createCarProduct().doSomething();
        factory.createAirplaneProduct().doSomething();
    }
}
