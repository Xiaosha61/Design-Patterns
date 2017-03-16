

public abstract class Person {
	
	public abstract void addRole(PersonRole role);
	public abstract void removeRole(PersonRole role);
	public abstract PersonRole getRole(String context);
	
	public abstract String sayHello();

}
