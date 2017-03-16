
public class ConcreteBuilder1 extends Builder{

	ProductPeople people = new ProductPeople() ;
	@Override
	public void BuildPart1() {
		// TODO Auto-generated method stub
		people.addPart("A Small head.");
	}

	@Override
	public void BuildPart2() {
		// TODO Auto-generated method stub
		people.addPart("A Small body.");

	}

	@Override
	public ProductPeople getResult() {
		// TODO Auto-generated method stub
		return this.people;
	}
	

}
