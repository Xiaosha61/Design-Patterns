package Strategy;

public class RealDuck extends Duck{
	 public RealDuck(){
		 flyBehavior = new FlyWithWings();
		 quackBehavior = new Quack();
	 }
	 
	 public void display(){
		 System.out.println("I am a real real duck!");
	 }

}
