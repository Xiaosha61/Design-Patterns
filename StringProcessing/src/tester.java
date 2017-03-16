
public class tester {

	public static void main(String[] args){
		
		String s = "cool program";
		System.out.println(Leet.toLeet(s));
		
		String[] myArray = new String[]{"Hallo","cool program","my code","delicious","We are elite hackers!","Informatiker machen cool Sachen!"};		
		for(String a : Leet.allToLeet(myArray)){
			System.out.println(a);
		}

	}

}
