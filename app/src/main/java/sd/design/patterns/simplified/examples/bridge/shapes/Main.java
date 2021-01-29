package sd.design.patterns.simplified.examples.bridge.shapes;

public class Main {
    public static void main(String... args) {
        Shape triangle = new Triangle(new RGB(255, 255, 255));
        triangle.draw();

        Shape circle = new Circle(new CMYK(54, 58, 66, 99));
        circle.draw();
    }
}
