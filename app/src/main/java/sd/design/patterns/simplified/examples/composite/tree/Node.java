package sd.design.patterns.simplified.examples.composite.tree;

import java.util.ArrayList;
import java.util.List;

public class Node implements Part {
    private List<Part> leafs = new ArrayList<>();

    @Override
    public void printChilds() {
        leafs.forEach(Part::printChilds);
    }

    public void addChild(Part leaf) {
        leafs.add(leaf);
    }
    public void test() {}
}
