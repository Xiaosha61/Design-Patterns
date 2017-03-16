
public class ConcreteElementGerman extends Element
{

	@Override
	public void Accept(Visitor v) {
		v.VisitConcreteElementGerman(this);
	}

}
