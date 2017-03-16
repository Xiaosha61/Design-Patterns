import java.util.Enumeration;
import java.util.Iterator;

public class IteratorToEnumeration implements Enumeration<String> {
	
	Iterator<String> arrayList;
	
	public IteratorToEnumeration(Iterator<String> arrayList){
		this.arrayList = arrayList;
	}
	

	@Override
	public boolean hasMoreElements() {
		// TODO Auto-generated method stub
		return this.arrayList.hasNext();
	}

	@Override
	public String nextElement() {
		// TODO Auto-generated method stub
		return this.arrayList.next();
	}

}
