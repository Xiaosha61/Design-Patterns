
public class Chinese extends People<EatSpicy>{
	
	@Override
	public void live() {
		this.set(new EatSpicy());
		//this.set(new EatSweet()); // invalid --> typle-safe !! Chinese is binded with EatSpicy.
		System.out.println("I come from China and I speak Chinese.");
		this.someEatHabit.eat();
	}
	
}
