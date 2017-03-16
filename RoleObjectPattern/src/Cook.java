
public class Cook extends PersonRole {
	
	int i = 0;
	
	Cook(){
		setContext("Cook");
	}

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		//this.cook();
		System.out.println(this.i);
		return core.sayHello() + ". I am a cook!";
		
	}
	
	// new fufunctionality
	public void cook(){
		System.out.println("Tell me what do you want to eat:) I will cook...");
	}
	
	public void setThis(int i){
		this.i = i;
	}

}
