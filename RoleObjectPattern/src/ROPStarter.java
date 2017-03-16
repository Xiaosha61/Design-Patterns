
public class ROPStarter {

	public static void main(String[] args){
		Person p = new PersonCore("Xiaosha");
		PersonRole student = new Student();
		PersonRole child = new Child();
		PersonRole cook = new Cook();
		p.addRole(student);
		p.addRole(child);
		p.addRole(cook);
		
		System.out.println(p.getRole("Cook").sayHello());
		
		Cook c = (Cook)p.getRole("Cook");
		c.cook();
		c.setThis(3);
		
		System.out.println(p.getRole("Cook").sayHello());

		
		
		
	}
	
}
