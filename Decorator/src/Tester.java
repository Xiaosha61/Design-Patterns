
public class Tester {
	public static void main(String[] args){
		Beverage b1 = new Coffee();
		System.out.println(b1.getDescription());
		System.out.println(b1.cost());
		
		b1 = new Milk(b1);
		System.out.println(b1.getDescription());
		System.out.println(b1.cost());
		
		b1 = new Suger(b1);
		System.out.println(b1.getDescription());
		System.out.println(b1.cost());
		
		b1 = new Milk(b1);
		System.out.println(b1.getDescription());
		System.out.println(b1.cost());
		
	
		
		
		

	}

}
