package sd.design.patterns.simplified.examples.bridge.shapes;

import static java.lang.String.format;

public class Triangle extends Shape {
    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.printf("Triangle rendered with %s%n", color.fill());
    }
}
