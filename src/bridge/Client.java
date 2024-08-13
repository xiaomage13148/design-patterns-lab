package bridge;

public class Client {
    public static void main(String[] args) {
        Color color = new YellowColor();
        Shape circle = new Circle(color);
        circle.draw();
    }
}
