package myPackage;
 
public class Human {
	private String forename;
	private String name;
	
	Human(String forename, String name){
		this.name = name;
		this.forename = forename;
	}
	
	
	public String getName(){
		return name;
	}
	
	public String getForename(){
		return forename;
	}
	
	public String toString(){
		return forename + " " + name;
	}

}
 