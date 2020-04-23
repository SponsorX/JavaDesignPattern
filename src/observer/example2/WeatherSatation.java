package observer.example2;

public class WeatherSatation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		GeneralDisplay generalDisplay = new GeneralDisplay(weatherData);
		
		weatherData.setMeasurements(60, 65, 70.0f);
		weatherData.setMeasurements(59, 70, 75.0f);
	}

}
