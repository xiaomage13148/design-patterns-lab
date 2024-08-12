package builder;

public abstract class AbstractComputerBuilder {
    protected Computer computer;
    public void createComputer() {
        computer = new Computer(0 , 0);
    }
    public Computer getComputer() {
        return computer;
    }

    public abstract void buildRam();

    public abstract void buildStorage();
}
