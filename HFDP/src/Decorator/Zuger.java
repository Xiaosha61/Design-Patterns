package Decorator;

public class Zuger extends CondimentDecorator{
	
	private Beverage beverage;
	
	public Zuger(Beverage beverage){
		this.beverage = beverage;
	}
	public String getDescription(){
		return beverage.getDescription()+" mit Zuger";
	}
	
	public double cost(){
		return beverage.cost()+0.10;
		
	}

}
