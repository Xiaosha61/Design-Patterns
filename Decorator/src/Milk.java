
public class Milk extends CondimentDecorator{

	public Milk(Beverage b) {
		super(b);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return this.beverage.cost() + 0.45;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.beverage.getDescription() + " with Milk.";
	}

}
