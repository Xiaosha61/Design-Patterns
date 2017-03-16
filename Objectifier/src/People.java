
public class People {
	
	EatHabit eatHabit;
	SpeakLanguage speakLanguage;
	
	public void live(){
		eatHabit.eat();
		speakLanguage.speak();
		sleep();
	}
	
	public void sleep(){
		System.out.println("I sleep at least for 7 hours.");

	}
	
	public void setEatHabit(EatHabit eh){
		this.eatHabit = eh;
	}
	
	public void setSpeakLanguage(SpeakLanguage sl){
		this.speakLanguage = sl;
	}
	
	
}
