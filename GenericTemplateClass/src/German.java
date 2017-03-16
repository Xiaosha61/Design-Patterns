
public class German extends People<EatSweet>{

	@Override
	public void live() {
		this.set(new EatSweet());
		//this.set(new EatSweet()); // invalid --> typle-safe !! German is binded with EatSweet.
		System.out.println("I come from Ukraine and I speak Ukrainian.");
		this.someEatHabit.eat();		
	}
	
}
