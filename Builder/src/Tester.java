
public class Tester {

	public static void main(String[] args){
		
		 //with director
		Director director = new Director();
		Builder builder1 = new ConcreteBuilder1();
		
		//director.createPeople(builder1);
		
		ProductPeople p = builder1.getResult();
		p.displayThis();
	
		/*
		 //without director
		Builder b = new ConcreteBuilder2();
		b.createPeople();
		ProductPeople pp = b.getResult();
		pp.displayThis();
		*/
		
	}
}
