package factory.simple;

public class AircraftProduct implements Product {
    @Override
    public void doSomething() {
        System.out.println("AircraftProduct ...");
    }
}
