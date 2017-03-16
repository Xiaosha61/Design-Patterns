
public class OperationFactory {
	
	public static Operation createAnOperationObject(String s){
		
		switch(s){
		case "+" : 
			return new Addition();
		case "-" :
			return new Subtraction();
		case "*" :
			return new Multiplication();
		case "/" :
			return new Division();

		default:
			return null;
		}			
				
	}

}
