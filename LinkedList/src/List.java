import java.util.ArrayList;

public class List {

	static ArrayList<ListElement> linkedList = new ArrayList<ListElement>();
			
	public void append(String string){
		ListElement e = new ListElement(string);
		
		linkedList.add(e);
		
		if(linkedList.size() > 1){
			linkedList.get(linkedList.size()-2).setNext(e);
		}
	}
	
	
	public String remove(String string){
		
		if(linkedList.isEmpty()){
			return null;
		}
		
		for(int i=0; i<linkedList.size();i++){
			if(linkedList.get(i).getContent().equals(string)){
				linkedList.get(i-1).setNext(linkedList.get(i+1));
				linkedList.remove(i);
				return linkedList.get(i).getContent();
			}
		}
		
		return null;

	}

}
