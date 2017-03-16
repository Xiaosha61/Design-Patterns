import java.util.Scanner;

public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Scanner inputA = new Scanner(System.in);
			System.out.println("Type in the first number:");
			double numA = Double.parseDouble(inputA.next());
			
			Scanner inputB = new Scanner(System.in);
			System.out.println("Type in the second number:");
			double numB = Double.parseDouble(inputB.next());
			
			Scanner inputO = new Scanner(System.in);
			System.out.println("Type in the operator (+-*/):");
			String operator = inputO.next();
			
			Operation o = OperationFactory.createAnOperationObject(operator);
			System.out.println(o.getResult(numA, numB));
			
		}catch(Exception ex){
			System.out.println("Wrong Input!!!" );
		}
		
		

	}

}
