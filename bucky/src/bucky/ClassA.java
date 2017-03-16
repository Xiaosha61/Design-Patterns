package bucky;

public class ClassA {
	
	ClassB b;
	
	public ClassA(ClassB b){
		this.b=b;
	}
	
	public void foo(){
		b.bar();
	}
	
	public void m1(){
		System.out.println("this = a");
	}


}
