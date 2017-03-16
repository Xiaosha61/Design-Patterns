
public class tester{
	public static void main(String[] args ){
		List l1 = new List();
		l1.append("first element");
		l1.append("second element");
		l1.append("third element");

		System.out.println(l1.linkedList);
		System.out.println(l1.linkedList.get(0).getNext());

		
		l1.remove("second element");
		System.out.println(l1.linkedList);
		System.out.println(l1.linkedList.get(0).getNext());


	}
}