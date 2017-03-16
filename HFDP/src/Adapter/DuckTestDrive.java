package Adapter;

public class DuckTestDrive {
	public static void main(String[] args){
		MallardDuck duck = new MallardDuck();
		
		WildTurkey turkey = new WildTurkey();
		
		TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);
		
		System.out.println("The turkey says...");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("\nThe duck says...");
		duck.quack();
		duck.fly();
		
		System.out.println("\nThe TurkeyAdapter says...");
		turkeyAdapter.quack();
		turkeyAdapter.fly();

	}
}
