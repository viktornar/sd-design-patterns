package sd.design.patterns.simplified.examples.visitor;

public abstract class Element {
    public String uuid;

    public Element(String uuid) {
        this.uuid = uuid;
    }

    public abstract void process(Visitor v);
}
