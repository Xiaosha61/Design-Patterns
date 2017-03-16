package RuleValidator;


public class TerminalExpression extends Expression{

	private String literal = null;
	
	public TerminalExpression(String str){
		literal = str;
	}
	@Override
	public boolean interpret(String context) {
		// TODO Auto-generated method stub	
		if(context.contains(this.literal)){
			return true;
		}
		
		return false;
	}
	
}
