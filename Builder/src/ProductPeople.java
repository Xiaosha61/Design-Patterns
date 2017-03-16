import java.util.ArrayList;

public class ProductPeople {
	
	ArrayList<String> parts = new ArrayList<String>();
	
	public void addPart(String s){
		parts.add(s);
	}
	
	public void displayThis(){
		for(String s : parts){
			System.out.println(s);
		}
	}
	
	
}
