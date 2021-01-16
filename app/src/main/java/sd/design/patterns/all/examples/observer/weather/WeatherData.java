package sd.design.patterns.all.examples.observer.weather;

import java.util.*;

public class WeatherData implements Subject {
	private List<sd.design.patterns.all.examples.observer.weather.Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList<sd.design.patterns.all.examples.observer.weather.Observer>();
	}
	
	public void registerObserver(sd.design.patterns.all.examples.observer.weather.Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(sd.design.patterns.all.examples.observer.weather.Observer o) {
		observers.remove(o);
	}
	
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(temperature, humidity, pressure);
		}
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	public float getTemperature() {
		return temperature;
	}
	
	public float getHumidity() {
		return humidity;
	}
	
	public float getPressure() {
		return pressure;
	}

}
