
public class ConcreteElementJapanese extends Element {

	@Override
	public void Accept(Visitor v) {
		v.VisitConcreteElementJapanese(this);
	}

}
