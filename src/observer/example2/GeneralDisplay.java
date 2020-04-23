package observer.example2;

import java.util.Observable;
import java.util.Observer;

public class GeneralDisplay implements Observer,DisplayElement {
	private float temperature;
	private float humidity;
	private float pressure;
	Observable observable;
	
	public GeneralDisplay(Observable o) {
		this.observable = o;
		o.addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)o;
			this.temperature = weatherData.getTemp();
			this.humidity = weatherData.getHumidity();
			this.pressure = weatherData.getPressure();
			display();
		}
	}
	@Override
	public void display() {
		System.out.println("----- GeneralDisplay -----");
		System.out.println("Current condition: "+temperature + "F digrees, " + humidity +"% humidity and " + pressure + " pressure");
	
	}

}
