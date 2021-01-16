package sd.design.patterns.all.examples.combining.composite;

public class RedheadDuck implements Quackable {
	public void quack() {
		System.out.println("Quack");
	}

	public String toString() {
		return "Redhead Duck";
	}
}
