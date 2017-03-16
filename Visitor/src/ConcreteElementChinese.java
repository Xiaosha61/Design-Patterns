
public class ConcreteElementChinese extends Element{

	@Override
	public void Accept(Visitor v) {
		v.VisitConcreteElementChinese(this);
	}
	

}
