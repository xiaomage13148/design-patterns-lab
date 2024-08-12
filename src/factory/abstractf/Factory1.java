package factory.abstractf;

public class Factory1 implements Factory {
    @Override
    public CarProduct createCarProduct() {
        return new AudiCarProduct();
    }

    @Override
    public AirplaneProduct createAirplaneProduct() {
        return new FighterAirplaneProduct();
    }
}
