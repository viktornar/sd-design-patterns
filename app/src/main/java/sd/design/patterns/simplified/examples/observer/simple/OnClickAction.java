package sd.design.patterns.simplified.examples.observer.simple;

public class OnClickAction implements Observer {
	private final String name;
	private int value;

	public OnClickAction(String name) {
		this.name = name;
	}
	
	public void update(int value) {
		this.value = value;
		display();
	}
	
	public void display() {
		System.out.printf("Obsderver %s got value: %s", name,value);
	}
}
