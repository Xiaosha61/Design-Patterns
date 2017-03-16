package FactoryMethod;

public class PizzaTestDrive {
	public static void main(String[] args){
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		
		Pizza pizza1 = nyStore.orderPizza("cheese");
		System.out.println("Xinxin ordered a " + pizza1.getName() +"\n");
		
		
		Pizza pizza2 = chicagoStore.orderPizza("pepperoni");
		System.out.println("Shasha ordered a " + pizza2.getName() + "\n");
	}
}
