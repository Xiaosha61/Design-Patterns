
public abstract class People<T extends EatHabit>{
	
	public T someEatHabit;
	
	public T get(){
		return this.someEatHabit;
	}
	
	public void set(T t){
		this.someEatHabit = t;
	}
	
	public abstract void live();
	
	/*
	public void live(){
		someEatHabit.eat();
		sleep();
	}
	*/
	
	public void sleep(){
		System.out.println("I sleep at least 7 hours.");
	}

}
