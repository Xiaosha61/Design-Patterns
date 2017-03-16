// http://www.cnblogs.com/chengxingliang/archive/2011/10/24/2214033.html


public class tester {
	public static void main(String[] args){
		Groups g = new Groups();
		
		g.AddElement(new ConcreteElementChinese());
		g.AddElement(new ConcreteElementGerman());
		g.AddElement(new ConcreteElementJapanese());
		
		Visitor vEat = new ConcreteVisitorEat();
		Visitor vSpeak = new ConcreteVisitorSpeak();
		g.Accept(vEat);
		g.Accept(vSpeak);
		
		g.RemoveElement(1);
		g.Accept(vEat);

	}

}
