package prototype;

public class PrototypeTest {
    public static void main(String[] args) {
        Prototype prototype = new PrototypeInstance("ghg");
        Prototype clone = prototype.clone();
        System.out.println(clone == prototype);
    }
}
