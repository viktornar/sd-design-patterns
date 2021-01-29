package sd.design.patterns.simplified.examples.bridge.shapes;

import static java.lang.String.format;

public class RGB implements Color{
    private int red;

    public RGB(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    private int green;
    private int blue;

    @Override
    public String fill() {
        return format("RGB{%s, %s, %s}", red, green, blue);
    }
}
