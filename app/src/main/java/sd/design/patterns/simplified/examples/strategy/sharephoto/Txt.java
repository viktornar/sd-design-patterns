package sd.design.patterns.simplified.examples.strategy.sharephoto;

public class Txt implements ShareStrategy {
	public void share() {
		System.out.println("I'm txting the photo");
	}
}
