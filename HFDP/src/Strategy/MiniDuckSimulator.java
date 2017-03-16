package Strategy;

public class MiniDuckSimulator {
	public static void main(String[] arg){
		Duck xxs = new RealDuck();
		
		xxs.performFly();
		xxs.performQuack();
		//xxs.quackBehavior;
		xxs.display();
		xxs.swim();
		
		xxs.setFlyBehavior(new FlyNoWay());
		xxs.performFly();
		
	}
}
