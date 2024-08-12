package factory.simple;

public class CalculatorProduct implements Product {

    @Override
    public void doSomething() {
        System.out.println("CalculatorProduct ...");
    }
}
