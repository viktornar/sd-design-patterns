package sd.design.patterns.simplified.examples.observer.simple;

public interface Subject {
	public void addActionListener(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
