package sd.design.patterns.simplified.examples.visitor;

import java.util.ArrayList;
import java.util.List;

public class Document extends Element {
    private final List<Element> elements = new ArrayList<>();

    public Document(String uuid) {
        super(uuid);
    }

    @Override
    public void process(Visitor v) {
        for (Element e : this.elements) {
            e.process(v);
        }
    }

    public List<Element> getElements() {
        return elements;
    }
}
