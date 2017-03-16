
public class Functions {
	
	public static int faculty(int n) {
		if(n == 0)
			return 1;
		else{
			return n * faculty(n-1);
		}
	}
	
	
	public static void main(String args[]){
		int n = 7;
		
		System.out.println("The faculty of " + n + " is " + faculty(n) + ".");
	}
}
