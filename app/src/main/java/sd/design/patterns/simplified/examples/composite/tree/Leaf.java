package sd.design.patterns.simplified.examples.composite.tree;

public class Leaf implements Part {
    @Override
    public void printChilds() {
        System.out.printf("Leaf: %s%n", this);
    }
}
