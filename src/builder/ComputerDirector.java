package builder;

public class ComputerDirector {
    private AbstractComputerBuilder builder;

    public ComputerDirector(AbstractComputerBuilder builder) {
        this.builder = builder;
    }

    public static void main(String[] args) {
        GameComputerBuilder gameComputerBuilder = new GameComputerBuilder();
        ComputerDirector computerDirector = new ComputerDirector(gameComputerBuilder);
        computerDirector.builder.createComputer();
        computerDirector.builder.buildRam();
        computerDirector.builder.buildStorage();
        Computer computer = computerDirector.builder.getComputer();
        System.out.println(computer.toString());
    }
}
