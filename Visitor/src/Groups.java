import java.util.ArrayList;

public class Groups {
	
	ArrayList<Element> groupList = new ArrayList<Element>();
	
	public void AddElement(Element e){
		groupList.add(e);
	}
	
	public void RemoveElement(Element e){
		groupList.remove(e);
	}
	
	public void RemoveElement(int index){
		groupList.remove(index);
	}
	
	
	public void Accept(Visitor v){
		for(Element e : groupList){
			e.Accept(v);
		}
	}
}
