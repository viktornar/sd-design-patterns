package sd.design.patterns.simplified.examples.composite.tree;

import java.util.ArrayList;
import java.util.List;

public class Node implements Part {
    private List<Part> leafs = new ArrayList<>();

    @Override
    public void printChilds() {
        System.out.printf("Node: %s%n", this);
        leafs.forEach(Part::printChilds);
    }

    public void addChild(Part leaf) {
        leafs.add(leaf);
    }
}
