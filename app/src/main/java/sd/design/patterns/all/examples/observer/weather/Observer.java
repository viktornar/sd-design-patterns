package sd.design.patterns.all.examples.observer.weather;

public interface Observer {
	public void update(float temp, float humidity, float pressure);
}
