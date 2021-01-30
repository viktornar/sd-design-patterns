package sd.design.patterns.simplified.examples.observer.simple;

public class Main {

	public static void main(String[] args) {
		SimpleButton button = new SimpleButton();

		button.addActionListener(new OnClickAction("First observer"));
		button.addActionListener(new OnClickAction("Second observer"));

		button.onClick(80);
	}
}
