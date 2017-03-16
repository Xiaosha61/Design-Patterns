import java.util.ArrayList;

public class Tester {
	
	public static void main(String[] args){
		// using the same Generic Class
		
		//1. without any constraints of the type.
		WithGenerics noConstraints = new WithGenerics();
	
		noConstraints.set("string");
		System.out.println(noConstraints.get());

		noConstraints.set(12);
		System.out.println(noConstraints.get());
		
		noConstraints.set(new Animal());
		System.out.println(noConstraints.get());

		//2. with a constraint of the type to be String.
		WithGenerics<String> strings = new WithGenerics<String>();
		
		strings.set("string");
		System.out.println(strings.get());
		
		//strings.set(12);  //invalid
		//strings.set(new Animal()); //invalid
             
             //3. with a constraint of the type to be Animal or its subclasses
		WithGenerics<Animal> animals = new WithGenerics<Animal>();
		animals.set(new Animal());
		System.out.println(animals.get());
		animals.set(new Dog());
		System.out.println(animals.get());
		
		
		boolean isEqual = Tester.isEqual(strings, strings);
		System.out.println(isEqual);
		boolean isEqual1 = Tester.isEqual(animals, animals);
		System.out.println(isEqual1);
		//boolean isEqual2 = Tester.isEqual(animals, strings);
		//System.out.println(isEqual2);

	}
	
	
 

	public static <T> boolean isEqual(WithGenerics<T> g1, WithGenerics<T> g2){
		return g1.get().equals(g2.get());
	}
}