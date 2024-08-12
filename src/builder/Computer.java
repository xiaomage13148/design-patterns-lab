package builder;

public class Computer {
    private int ram;
    private int storage;

    public Computer(int ram, int storage) {
        this.ram = ram;
        this.storage = storage;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ram=" + ram +
                ", storage=" + storage +
                '}';
    }
}
