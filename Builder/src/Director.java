
public class Director {
	
	Builder builder ;
	
	public void createPeople(Builder cBuilder){
		this.builder = cBuilder;
		builder.BuildPart1();
		builder.BuildPart2();
	}
	

}
