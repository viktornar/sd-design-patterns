package sd.design.patterns.simplified.examples.bridge.shapes;

import static java.lang.String.format;

public class CMYK implements Color {
    int cyan;

    public CMYK(int cyan, int magenta, int yellow, int black) {
        this.cyan = cyan;
        this.magenta = magenta;
        this.yellow = yellow;
        this.black = black;
    }

    int magenta;
    int yellow;
    int black;

    @Override
    public String fill() {
        return format("CMYK{%s, %s, %s, %s}", cyan, magenta, yellow, black);
    }
}
