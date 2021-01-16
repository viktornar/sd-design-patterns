package sd.design.patterns.simplified.examples.singleton.nonthreadsafe;

public class Singleton {
	private static Singleton uniqueInstance;
	private Singleton() {}
 
	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
	public String getDescription() {
		return "I'm a not thread safe Singleton!";
	}
}
