
public class Tester<T extends EatHabit> {
	
	public static void main(String args[]){
		
		People xxs = new Chinese();
		xxs.set(new EatSpicy());
		//xs.set(new EatSweet()); // invalid --> type-safe !! Xiaosha is binded with EatSpicy.
		xxs.live();
		
		People victor = new German();
		victor.set(new EatSweet());
		//ty.set(new EatSpicy());  // invalid --> type-safe!! Tanya is bind with EatSweet.
		victor.live();
	}
	

}
