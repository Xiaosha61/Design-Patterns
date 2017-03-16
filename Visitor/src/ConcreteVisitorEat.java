
public class ConcreteVisitorEat extends Visitor{

	@Override
	public void VisitConcreteElementChinese(ConcreteElementChinese cec) {
		System.out.println("We eat hotpot!");
		
	}

	@Override
	public void VisitConcreteElementGerman(ConcreteElementGerman ceg) {
		System.out.println("We eat potato!");
		
	}

	@Override
	public void VisitConcreteElementJapanese(ConcreteElementJapanese cej) {
		System.out.println("We eat Sushi!");
		
	}

}
