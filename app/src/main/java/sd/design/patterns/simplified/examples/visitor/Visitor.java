package sd.design.patterns.simplified.examples.visitor;

public interface Visitor {
    void visit(XmlElement xe);

    void visit(JsonElement je);
}
