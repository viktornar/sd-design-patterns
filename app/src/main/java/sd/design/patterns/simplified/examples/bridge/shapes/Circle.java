package sd.design.patterns.simplified.examples.bridge.shapes;

import static java.lang.String.format;

public class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.printf("Circle rendered with %s%n", color.fill());
    }
}
