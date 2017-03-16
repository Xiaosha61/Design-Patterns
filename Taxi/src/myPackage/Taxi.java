package myPackage;
import java.util.ArrayList;

public class Taxi {
	
	private Human driver;
	private ArrayList<Human> passengers = new ArrayList<Human>();
	
	
	Taxi(Human driver){
		this.driver = driver;
	}
	
	public String getDriverName(){
		return driver.getForename() + " " + driver.getName();
	}
	
	public void add(Human x){
		
		String fullName = x.getForename() + " " + x.getName();
		
		if(passengers.size() >= 4){
			System.out.println("We are sorry, " + fullName + ". The taxi is full.");
		}
		else{
			passengers.add(x);
			System.out.println(fullName + " gets in.");
		}
	}
	
	public ArrayList<Human> allGetOut(){
		if(passengers.isEmpty()){
			return passengers;	
		}
		else{
			ArrayList<Human> formerPsgers = new ArrayList<Human>();
			//formerPsgers = passengers; //NONONO.!
			for(Human x : passengers){
				formerPsgers.add(x);
			}
			passengers.clear();
			return formerPsgers;
		}
	}
	
	public String toString(){
		String px = " ";
		if(passengers.isEmpty()){
			px = "nobody";
		}
		else{
			
			for(int i=0; i<passengers.size();i++){
				String fullName = passengers.get(i).getForename() + " " + passengers.get(i).getName();
				px = px + fullName;
				
				int remain = passengers.size() - i - 1;
				switch(remain){
					case 0: px += " ";
							break;
					case 1: px += " and ";
							break;
					case 2: px += ", ";
							break;
					case 3: px += ", ";
							break;
					default: px += "Error";
							break;
				}
					
				
			}
			
		}
	
		return "This is the taxi of " + driver.getForename() + " "+ driver.getName() + ". He takes" + px +"along.";
	}

}
