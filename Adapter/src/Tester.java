import java.util.ArrayList;
import java.util.Iterator;

public class Tester {
	public static void main(String[] args){
		ArrayList<String> a1 = new ArrayList<>();
		a1.add("string 1");
		a1.add("string 2");
		a1.add("string 3");
		a1.add("string 4");

		Iterator<String> iterator = a1.iterator(); //ArrayList has iterator() method to create Iterator.
		
		IteratorToEnumeration iterToEnum = new IteratorToEnumeration(iterator);

		System.out.print(iterToEnum.hasMoreElements());
		
		iterToEnum.hasMoreElements();
		iterToEnum.nextElement();
		
		
		iterator.next();
		iterator.hasNext();
		
	}
}









