
public abstract class CondimentDecorator extends Beverage{
	Beverage beverage;
	
	public CondimentDecorator(Beverage b){
		this.beverage = b;
	}
}
