package Observer;

import java.util.*;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
	
		CurrentConditionDisplay currentDisplay = 
			new CurrentConditionDisplay(weatherData);//每定义一个新的observer类型的变量，它自己就会去注册。调用register的行为写在了它的constructor里了已经。
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);//同上	
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);//同上

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
		
		currentDisplay.letMeDie(weatherData);
		weatherData.setMeasurements(80, 65, 30.4f);
	}
}