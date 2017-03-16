
public class Division extends Operation{

	@Override
	public double getResult(double num1, double num2) {
		// TODO Auto-generated method stub
		if(num2 == 0){
			System.out.println("A divider can not be 0 !");
			return 0;
		}
		return num1/num2;
	}
	
	

}
