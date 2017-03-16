
public class Suger extends CondimentDecorator {

	public Suger(Beverage b) {
		super(b);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.beverage.getDescription() + " with Suger.";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return this.beverage.cost() + 0.1;
	}

}
