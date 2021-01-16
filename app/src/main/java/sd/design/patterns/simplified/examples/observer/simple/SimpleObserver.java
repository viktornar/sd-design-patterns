package sd.design.patterns.simplified.examples.observer.simple;

public class SimpleObserver implements Observer {
	private final String name;
	private int value;

	public SimpleObserver(String name, Subject simpleSubject) {
		this.name = name;
		simpleSubject.registerObserver(this);
	}
	
	public void update(int value) {
		this.value = value;
		display();
	}
	
	public void display() {
		System.out.printf("Obsderver %s got value: %s", name,value);
	}
}
