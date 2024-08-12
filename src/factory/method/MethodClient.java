package factory.method;

public class MethodClient {
    public static void main(String[] args) {
        AircraftFactory aircraftFactory = new AircraftFactory();
        aircraftFactory.factoryMethod().doSomething();

        CalculatorFactory calculatorFactory = new CalculatorFactory();
        calculatorFactory.factoryMethod().doSomething();
    }
}
