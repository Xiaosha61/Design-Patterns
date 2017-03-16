package myPackage;

public class tester {
	public static void main(String args[]){
		
		Human driver1  = new Human("Luka", "Modric");
		
		Human h1 = new Human("Jialiang","Yin");
		Human h2 = new Human("Xiaosha","Xing");
		Human h3 = new Human("Xiaozhen","Wang");
		Human h4 = new Human("Qun", "Huang");
		Human h5 = new Human("Joachim", "Loew");

		Taxi t1 = new Taxi(driver1);
		
		t1.add(h1);
		t1.add(h2);
		t1.add(h3);
		t1.add(h4);
		t1.add(h5);
		
		System.out.println(t1);
		
		System.out.println(t1.allGetOut());
		

		
	}
}
