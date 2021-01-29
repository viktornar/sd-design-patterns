package sd.design.patterns.simplified.examples.visitor;

public class XmlElement extends Element {
    public XmlElement(String uuid) {
        super(uuid);
    }

    @Override
    public void process(Visitor v) {
        v.visit(this);
    }
}
