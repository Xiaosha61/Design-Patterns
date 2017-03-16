
public class Child extends PersonRole {

	public Child(){
		setContext("Child");
	}
	
	@Override
	public String sayHello() {
		return core.sayHello() + ". I'm a Child.";
	}

}
