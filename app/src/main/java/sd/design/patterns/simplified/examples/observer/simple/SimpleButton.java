package sd.design.patterns.simplified.examples.observer.simple;

import java.util.ArrayList;
import java.util.List;

public class SimpleButton implements Subject {
	private List<Observer> observers;
	private int value = 0;

	public SimpleButton() {
		observers = new ArrayList<>();
	}

	public void addActionListener(Observer o) {
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		observers.remove(o);
	}
	
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(value);
		}
	}
	
	public void onClick(int value) {
		this.value = value;
		notifyObservers();
	}
}