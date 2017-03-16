//public abstract class Shape  {
public abstract class Shape implements Cloneable{

   private String id;
   protected String type;
   
   abstract void draw();
   
   public String getType(){
      return type;
   }
   
   public String getId() {
      return id;
   }
   
   public void setId(String id) {
      this.id = id;
   }
   
   public Object clone() {
      return this;
   }
   /*
   // in this way, you need this Class to " implements Cloneable ".
   public Object clone() {
	      Object clone = null;
	      
	      try {
	         clone = super.clone(); 
	         // way to call Object.clone(), which is /protected/ by the interface Cloneable!!!.
	         // only the Class who implements Cloneable can call this protected method.!!2
	         
	      } catch (CloneNotSupportedException e) {
	         e.printStackTrace();
	      }
	      
	      return clone;
	 }
	*/
}