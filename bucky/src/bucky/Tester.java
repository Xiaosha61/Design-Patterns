package bucky;

public class Tester {

	public static void main(String[] args){
		ClassB b = new ClassB();
		ClassA a = new ClassA(b);
		
		a.foo();
		
	}
}
