
public abstract class People { ///
	
	public void live(){
		eat();  
		speak(); 
		sleep();
	}
	
	public abstract void eat(); ///
	
	public abstract void speak();  ///
	
	public void sleep(){
			System.out.println("Sleep at least 7 hours");
	}

}
