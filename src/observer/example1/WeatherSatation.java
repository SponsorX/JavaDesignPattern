package observer.example1;

public class WeatherSatation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentConditionDisplay = new CurrentConditionsDisplay(weatherData);
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
		
		weatherData.setMeassurements(60, 65, 70.0f);
		weatherData.setMeassurements(59, 70, 75.0f);
	}

}
