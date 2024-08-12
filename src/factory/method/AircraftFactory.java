package factory.method;

import factory.AircraftProduct;
import factory.Product;

public class AircraftFactory implements Factory {
    @Override
    public Product factoryMethod() {
        return new AircraftProduct();
    }
}
