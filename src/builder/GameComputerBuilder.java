package builder;

public class GameComputerBuilder extends AbstractComputerBuilder {
    @Override
    public void buildRam() {
        computer = new Computer(19, computer.getStorage());
    }

    @Override
    public void buildStorage() {
        computer = new Computer(computer.getRam(), 30);
    }
}
