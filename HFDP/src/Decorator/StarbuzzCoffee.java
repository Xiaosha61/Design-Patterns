package Decorator;

public class StarbuzzCoffee {
	public static void main(String args[]){
		
		Beverage beverage = new Espresso();
		beverage = new Mocha(beverage);
		beverage = new Soy(beverage);
		System.out.println("You've ordered a cup of "+beverage.getDescription() + ",	" + beverage.cost() + " $"+ " in total.");
		
		Beverage beverage1 = new MilchKaffee();
		beverage1 = new Zuger(beverage1);
		System.out.println("You've ordered a cup of "+beverage1.getDescription() + ",   	" + beverage1.cost() + " $"+ " in total.");
		
		
		
	}

}
