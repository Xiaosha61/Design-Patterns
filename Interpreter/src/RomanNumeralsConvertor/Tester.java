package RomanNumeralsConvertor;
import java.util.ArrayList;
import java.util.Iterator;

public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	      String roman = "M";
	      Context context = new Context(roman);

	      // Build the 'parse tree' 
	      ArrayList<Expression> tree = new ArrayList<Expression>();
	      tree.add(new ThousandExpression());
	      tree.add(new HundredExpression());
	      tree.add(new TenExpression());
	      tree.add(new OneExpression());

	      // Interpret 
	      for (Iterator<Expression> it = tree.iterator(); it.hasNext();)
	      {
	    	  Expression exp = it.next();
	    	  exp.interpret(context);

	      }

	      System.out.println(roman + " = " + Integer.toString(context.getOutput()));
	      

	}
}