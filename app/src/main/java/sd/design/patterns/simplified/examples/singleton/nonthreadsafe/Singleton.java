package sd.design.patterns.simplified.examples.singleton.nonthreadsafe;

public class Singleton {
	private static Singleton uniqueInstance;
	private String description = "Not thread safe";

	private Singleton() {}
 
	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
