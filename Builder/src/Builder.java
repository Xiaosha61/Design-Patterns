
public abstract class Builder {
	
	public abstract void BuildPart1();
	public abstract void BuildPart2();

	public abstract ProductPeople getResult();

	public void createPeople(){
		this.BuildPart1();
		this.BuildPart2();
	}
}
