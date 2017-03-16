
public class Honey extends CondimentDecorator{

	
	public Honey(Beverage b) {
		super(b);
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.beverage.getDescription() + " with Honey.";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return this.beverage.cost() + 0.15;
	}

}
