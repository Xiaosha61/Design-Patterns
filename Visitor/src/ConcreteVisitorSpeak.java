
public class ConcreteVisitorSpeak extends Visitor{

	@Override
	public void VisitConcreteElementChinese(ConcreteElementChinese cec) {
		System.out.println("We speak Chinese!");
		
	}

	@Override
	public void VisitConcreteElementGerman(ConcreteElementGerman ceg) {
		System.out.println("We speak German!");
	}

	@Override
	public void VisitConcreteElementJapanese(ConcreteElementJapanese cej) {
		System.out.println("We speak Japanese!");
		
	}

}
