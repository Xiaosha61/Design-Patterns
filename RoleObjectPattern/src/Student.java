
public class Student extends PersonRole {

	public Student(){
		setContext("Student");
	}
	
	@Override
	public String sayHello() {
		this.study();
		return core.sayHello() + ". I'm a student.";
	}

	//new functionality 
	public void study(){
		System.out.println("I am studying.");

	}
}
