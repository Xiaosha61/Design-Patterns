package Observer;

public class CurrentConditionDisplay implements Observer , DisplayElement{
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);//register into the concrete subject's observer library(arrayList) 
	}
	
	public void update(float temperature, float humidity, float pressure) {
		
		
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}
	
	public void display() {
		System.out.println("Current conditions: " + temperature 
			+ "F degrees and " + humidity + "% humidity");
	}
	
	public void letMeDie(Subject weatherData){
		this.weatherData = weatherData;
		weatherData.removeObserver(this);
		
	}

}
