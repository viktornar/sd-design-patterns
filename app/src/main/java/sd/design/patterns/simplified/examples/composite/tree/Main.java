package sd.design.patterns.simplified.examples.composite.tree;


public class Main {
    public static void main(String... args) {
        Node node = new Node();

        Part leaf1 = new Leaf();
        node.addChild(leaf1);

        Part leaf2 = new Leaf();
        node.addChild(leaf2);

        Part leaf3 = new Leaf();
        node.addChild(leaf3);

        node.addChild(new Node() {{
            addChild(new Leaf());
        }});

        node.printChilds();
    }
}
