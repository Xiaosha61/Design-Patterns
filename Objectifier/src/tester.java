
public class tester {
	public static void main(String[] avgs){
		People p1 = new Xiaosha();
		p1.live();
		
		p1.setEatHabit(new ConcreteEatHabitB());
		p1.live();
		
		
		People p2 = new People();
		p2.setEatHabit(new ConcreteEatHabitA());
		p2.setSpeakLanguage(new ConcreteSpeakLanguageB());
		p2.live();
	}
}
