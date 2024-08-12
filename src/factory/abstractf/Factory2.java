package factory.abstractf;

public class Factory2 implements Factory {
    @Override
    public CarProduct createCarProduct() {
        return new BmwCarProduct();
    }

    @Override
    public AirplaneProduct createAirplaneProduct() {
        return new HelicoptersAirplaneProduct();
    }
}
