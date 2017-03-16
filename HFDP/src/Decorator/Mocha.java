package Decorator;

public class Mocha extends CondimentDecorator{
	
	private Beverage beverage ;
	
	public Mocha(Beverage beverage){
		this.beverage = beverage;
	}
	
	public String getDescription(){
		return beverage.getDescription() + "mit Mocha";
	}
	
	public double cost(){
		return beverage.cost()+0.20;
	}

}
