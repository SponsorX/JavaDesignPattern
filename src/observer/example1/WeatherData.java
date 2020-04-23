package observer.example1;

import java.util.ArrayList;

public class WeatherData implements Subject{
	float temp;
	float humidity;
	float pressure;
	private ArrayList<Observer> observerList;
	
	public WeatherData() {
		observerList = new ArrayList<Observer>();
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
	
	public void setHumidty(float humidty) {
		this.humidity = humidity;
	}
	public void setMeassurements(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
		
	}
	public float getPressure() {
		return pressure;
	}
	public void setPressure(float pressure) {
		this.pressure = pressure;
	}
	public void measurementsChanged() {
		/*
		 * float temp = getTemp(); float humidity = getHumidity(); float pressure =
		 * getPressure();
		 * 
		 * currentConditionsDisplay.update(temp, humidity, pressure);
		 * statisticsDisplay.update(temp, humidity, pressure);
		 * forecastDisplay.update(temp, humidity, pressure);
		 */
		notifyObservers();
	}
	public void registerObserver(Observer o) {
		observerList.add(o);
	}
	public void removeObserver(Observer o) {
		int i = observerList.indexOf(o);
		if(i >= 0) {
			observerList.remove(o);
		}
	}
	public void notifyObservers() {
		for(Observer o : observerList) {
			o.update(temp, humidity, pressure);
		}
	}

}
