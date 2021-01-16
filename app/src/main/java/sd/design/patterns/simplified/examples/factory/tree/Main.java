package sd.design.patterns.simplified.examples.factory.tree;

public class Main {
	public static void main(String[] args) throws Exception {
		TreeFactory treeFactory = new TreeFactory();
		Tree d = treeFactory.getTree("deciduous");
		Tree c = treeFactory.getTree("conifer");
	}
}