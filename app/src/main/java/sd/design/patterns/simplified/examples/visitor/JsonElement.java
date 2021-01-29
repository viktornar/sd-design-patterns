package sd.design.patterns.simplified.examples.visitor;

public class JsonElement extends Element {
    public JsonElement(String uuid) {
        super(uuid);
    }

    @Override
    public void process(Visitor v) {
        v.visit(this);
    }
}
