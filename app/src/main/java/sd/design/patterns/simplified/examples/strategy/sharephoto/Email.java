package sd.design.patterns.simplified.examples.strategy.sharephoto;

public class Email implements ShareStrategy {
	public void share() {
		System.out.println("I'm emailing the photo");
	}
}
