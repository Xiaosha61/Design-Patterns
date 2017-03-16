package AbstractFactory;

public class CheesePizza extends Pizza{
	PizzaIngredientFactory ingredientFactory;
	
	public CheesePizza(PizzaIngredientFactory ingredientFactory){
		this.ingredientFactory = ingredientFactory ;
	}
	
	void prepare(){
		System.out.println("Preparing "+ name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		// we only need these 3 ingredients for cheese pizza. 
		//Others just are ingnored and remain the default value.We won't use it.
	}

}
