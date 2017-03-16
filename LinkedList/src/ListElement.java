import java.util.Objects;

public class ListElement {
	private String content;
	private ListElement next = null;
	
	ListElement(String s){
		
		Objects.requireNonNull(s);

		if(s.isEmpty()){
			throw new IllegalArgumentException("The argument 'content' cannot be empty!");
		}
		else{
			this.content = s;
		}
		

		
	}
	
	public void setContent(String s){
		this.content = s;
	}
	
	public String getContent(){
		return this.content;
	}
	
	public void setNext(ListElement e){
		this.next = e;
	}
	
	public ListElement getNext(){
		return this.next;
	}
}
