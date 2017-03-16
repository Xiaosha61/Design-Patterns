
public class Calculator {
	
	static double getResult(double num1, double num2, String operator){

		switch(operator){
		case "+": 
			return num1 + num2;
		case "-": 
			return num1 - num2;
		case "*": 
			return num1 * num2;
		case "/": 
			if(num2 != 0){
				return num1 / num2;
			}
			else{
				System.out.println("A divider can NOT be ZERO !");
				return 0;
			}
		default:
			System.out.println("Invalid Operator Input!");
			return 0;

		}
		
	}

}
