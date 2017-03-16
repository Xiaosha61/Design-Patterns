
public class Tester {
	public static void main(String[] args){
		ShapeCache.loadCache();
		
		Shape clonedShape = (Shape) ShapeCache.getShape("1");
	    System.out.println("Shape : " + clonedShape.getType());		

	}
}
