package sd.design.patterns.simplified.examples.observer.simple;

public class Main {

	public static void main(String[] args) {
		SimpleSubject simpleSubject = new SimpleSubject();
	
		SimpleObserver simpleObserver1 = new SimpleObserver("First observer", simpleSubject);
		SimpleObserver simpleObserver2 = new SimpleObserver("Second observer", simpleSubject);

		simpleSubject.setValue(80);
		
		simpleSubject.removeObserver(simpleObserver1);
		simpleSubject.removeObserver(simpleObserver2);
	}
}
