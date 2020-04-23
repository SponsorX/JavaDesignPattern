package observer.example2;

import java.util.*;

import observer.example1.Observer;

public class WeatherData extends Observable{
	float temp;
	float humidity;
	float pressure;
	
	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temp = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	public float getTemp() {
		return temp;
	}
	public void setTemp(float temp) {
		this.temp = temp;
	}
	public float getHumidity() {
		return humidity;
	}
	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}
	public float getPressure() {
		return pressure;
	}
	public void setPressure(float pressure) {
		this.pressure = pressure;
	}
	
}
